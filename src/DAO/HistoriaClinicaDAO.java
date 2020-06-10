/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.HistoriaClinica;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author USER
 */
public class HistoriaClinicaDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
    
    public void crearHistoriaClinica(HistoriaClinica object){
    
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(object);
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    
    public boolean eliminarHistoriaClinica(HistoriaClinica object){
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try{
            em.remove(object);
            em.getTransaction().commit();
            ret=true;
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally{
            em.close();
            return ret;
        }
    }
    
    public HistoriaClinica leerHistoriaClinica(HistoriaClinica par){
        EntityManager em=emf.createEntityManager();
        HistoriaClinica hcLectura = null;
        Query q = em.createQuery("SELECT u FROM historiasClinicas u " +
                "WHERE u.numeroHistoria LIKE :numero")
                .setParameter("numero",par.getNumeroHistoria());
        try {
            hcLectura = (HistoriaClinica)q.getSingleResult();
        } catch(NonUniqueResultException e){
            hcLectura = (HistoriaClinica)q.getResultList().get(0);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
            return hcLectura;
        }
    }
    
    public boolean actualizarConsultorio(HistoriaClinica object,HistoriaClinica newObject){
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=leerHistoriaClinica(object);
            object.setEnfermedades(newObject.getEnfermedades());
            object.setFechaGeneracion(newObject.getFechaGeneracion());
            object.setPaciente(newObject.getPaciente());
            em.merge(object);
            em.getTransaction().commit();
            ret=true;
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally{
            em.close();
            return ret;
        }
    }
}
