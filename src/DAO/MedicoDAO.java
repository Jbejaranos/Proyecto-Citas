/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author USER
 */
import javax.persistence.*;
import Modelo.*;

public class MedicoDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
    
    public void crearMedico(Medico object){
    
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
    
    public boolean eliminarMedico(Medico object){
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
    
    public Medico leerMedico(long par){
        EntityManager em=emf.createEntityManager();
        Medico medicoLectura = null;
        Query q = em.createQuery("SELECT u FROM medicos u " +
                "WHERE u.id LIKE :identificacion")
                .setParameter("identificacion",par);
        try {
            medicoLectura = (Medico)q.getSingleResult();
        } catch(NonUniqueResultException e){
            medicoLectura = (Medico)q.getResultList().get(0);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
            return medicoLectura;
        }
    }
    
    public boolean actualizarMedico(long id,Medico newObject){
        EntityManager em=emf.createEntityManager();
        Medico object=null;
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=leerMedico(id);
            object.setNombre(newObject.getNombre());
            object.setPassword(newObject.getPassword());
            object.setGenero(newObject.getGenero());
            object.setFechaNacimiento(newObject.getFechaNacimiento());
            object.setEspecialidad(newObject.getEspecialidad());
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
