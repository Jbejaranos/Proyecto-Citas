/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.*;
import Modelo.*;
/**
 *
 * @author USER
 */
public class ConsultorioDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
    
    public void crearConsultorio(Consultorio object){
    
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
    
    public boolean eliminarConsultorio(Consultorio object){
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
    
    public Consultorio leerConsultorio(Consultorio par){
        EntityManager em=emf.createEntityManager();
        Consultorio consultorioLectura = null;
        Query q = em.createQuery("SELECT u FROM consultorios u " +
                "WHERE u.numero LIKE :numero")
                .setParameter("numero",par.getNumero());
        try {
            consultorioLectura = (Consultorio)q.getSingleResult();
        } catch(NonUniqueResultException e){
            consultorioLectura = (Consultorio)q.getResultList().get(0);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
            return consultorioLectura;
        }
    }
    
    public boolean actualizarConsultorio(Consultorio object,Consultorio newObject){
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=leerConsultorio(object);
            object.setNumero(newObject.getNumero());
            object.setSede(newObject.getSede());
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
