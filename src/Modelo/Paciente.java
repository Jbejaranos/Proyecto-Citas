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
public class Paciente extends Persona {
    
    private ArrayList<Cita> citasRegistradas;
    private HistoriaClinica historiaClinica;
    
    public Paciente(long identificacion, String nombre, String password, String genero, Date fechaNacimiento) {
        super(identificacion, nombre, password, genero, fechaNacimiento);
    }

    public ArrayList<Cita> getCitasRegistradas() {
        return citasRegistradas;
    }

    public void setCitasRegistradas(ArrayList<Cita> citasRegistradas) {
        this.citasRegistradas = citasRegistradas;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
}
