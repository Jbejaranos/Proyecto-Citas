/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name="historiasClinicas")
public class HistoriaClinica implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numeroHistoria;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaGeneracion;
    private Paciente paciente;
    private ArrayList<String> enfermedades;

    public HistoriaClinica(Calendar fechaGeneracion, Paciente paciente, ArrayList<String> enfermedades) {
        this.fechaGeneracion = fechaGeneracion;
        this.paciente = paciente;
        this.enfermedades = enfermedades;
    }

     public int getNumeroHistoria(){
        return this.numeroHistoria;
    }
    
    public Calendar getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Calendar fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    @OneToOne
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }
    
}
