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

public class AdministradorDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoCitasPU");
    
    public void crearAdministrador(Administrador object){
    
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
    
    public boolean eliminarAdministrador(Administrador object){
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
    
    public Administrador leerAdministrador(long par){
        EntityManager em=emf.createEntityManager();
        Administrador adminLectura = null;
        Query q = em.createQuery("SELECT u FROM administradores u " +
                "WHERE u.id LIKE :identificacion")
                .setParameter("identificacion",par);
        try {
            adminLectura = (Administrador)q.getSingleResult();
        } catch(NonUniqueResultException e){
            adminLectura = (Administrador)q.getResultList().get(0);
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            em.close();
            return adminLectura;
        }
    }
    
    public boolean actualizarAdministrador(long id,Administrador newObject){
        EntityManager em=emf.createEntityManager();
        Administrador object=null;
        em.getTransaction().begin();
        boolean ret=false;
        try{
            object=leerAdministrador(id);
            object.setNombre(newObject.getNombre());
            object.setPassword(newObject.getPassword());
            object.setGenero(newObject.getGenero());
            object.setFechaNacimiento(newObject.getFechaNacimiento());
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
