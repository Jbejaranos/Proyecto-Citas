/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jorge
 */
public class HistoriaClinica {
    
    private Date fechaGeneracion;
    private Paciente paciente;
    private ArrayList<String> enfermedades;

    public HistoriaClinica(Date fechaGeneracion, Paciente paciente, ArrayList<String> enfermedades) {
        this.fechaGeneracion = fechaGeneracion;
        this.paciente = paciente;
        this.enfermedades = enfermedades;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

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
