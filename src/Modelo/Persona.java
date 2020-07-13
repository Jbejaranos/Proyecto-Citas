/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="personas")
public class Persona implements java.io.Serializable {
    
    @Id
    @Column(name="id",updatable=false,nullable=false)
    private long identificacion;
    private String nombre;
    private String password;
    private String genero;
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;
    
    
    
    
    /*
    ________________________________________________________________________________________________uwu
    NUEVO NUEVO NUEVO !!    14 de junio by jortizsi
    referencia a datos de contacto
    */
    private ContactoPaciente datosContacto;
    
    public void setContactoPaciente(ContactoPaciente Cpac){
        this.datosContacto = Cpac;
    }
    
    public ContactoPaciente getContactoPaciente(){
        return datosContacto;
    }
    //_______________________________________________________________________________________________uwu
            
            
            
            
            
    public Persona(long identificacion, String nombre, String password, String genero, Calendar fechaNacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.password = password;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.datosContacto = null;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
