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

public class PacienteDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
    
    public void crearPaciente(Paciente object){
    
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
    
    public boolean eliminarPaciente(Paciente object){
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
    
    public Paciente leerPaciente(long par){
        EntityManager em=emf.createEntityManager();
        Paciente pacienteLectura = null;
        Query q = em.createQuery("SELECT u FROM pacientes u " +
                "WHERE u.id LIKE :identificacion")
                .setParameter("identificacion",par);
        try {
            pacienteLectura = (Paciente)q.getSingleResult();
        } catch(NonUniqueResultException e){
            pacienteLectura = (Paciente)q.getResultList().get(0);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
            return pacienteLectura;
        }
    }
    
    public boolean actualizarPaciente(long id,Paciente newObject){
        EntityManager em=emf.createEntityManager();
        Paciente object=null;
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=leerPaciente(id);
            object.setNombre(newObject.getNombre());
            object.setPassword(newObject.getPassword());
            object.setGenero(newObject.getGenero());
            object.setFechaNacimiento(newObject.getFechaNacimiento());
            object.setHistoriaClinica(newObject.getHistoriaClinica());
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
