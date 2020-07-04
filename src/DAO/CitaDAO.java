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

public class CitaDAO {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
    
    public void crearCita(Cita object){
    
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
    
    public boolean eliminarCita(Cita object){
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
    
    public Cita leerCita(Cita par){
        EntityManager em=emf.createEntityManager();
        Cita citaLectura = null;
        Query q = em.createQuery("SELECT u FROM citas u " +
                "WHERE u.numeroCita LIKE :numeroCita")
                .setParameter("numeroCita",par.getNumeroCita());
        try {
            citaLectura = (Cita)q.getSingleResult();
        } catch(NonUniqueResultException e){
            citaLectura = (Cita)q.getResultList().get(0);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
            return citaLectura;
        }
    }
    
    public boolean actualizarCita(Cita object,Cita newObject){
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=leerCita(object);
            object.setFecha(newObject.getFecha());
            object.setPaciente(newObject.getPaciente());
            object.setMedico(newObject.getMedico());
            object.setConsultorio(newObject.getConsultorio());
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
