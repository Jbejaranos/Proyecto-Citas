/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name="medicos")
public class Medico extends Persona{
    
    private ArrayList<Cita> citasAsignadas;
    private String especialidad;

    public Medico(long identificacion, String nombre, String password, String genero, Calendar fechaNacimiento, ArrayList<Cita> citasAsignadas, String especialidad) {
        super(identificacion, nombre, password, genero, fechaNacimiento);
        this.citasAsignadas = citasAsignadas;
        this.especialidad = especialidad;
    }
    
    public Medico(long identificacion, String nombre, String password, String genero, Calendar fechaNacimiento, String especialidad) {
        super(identificacion, nombre, password, genero, fechaNacimiento);
        //this.citasAsignadas = citasAsignadas;
        this.especialidad = especialidad;
    }

    public ArrayList<Cita> getCitasAsignadas() {
        return citasAsignadas;
    }

    public void setCitasAsignadas(ArrayList<Cita> citasAsignadas) {
        this.citasAsignadas = citasAsignadas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void addCitaMd(Cita c){
        this.citasAsignadas.add(c);
    }
}
