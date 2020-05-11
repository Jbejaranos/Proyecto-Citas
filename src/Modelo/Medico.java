/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Medico {
    
    private ArrayList<Cita> citasAsignadas;
    private String especialidad;

    public Medico(ArrayList<Cita> citasAsignadas, String especialidad) {
        this.citasAsignadas = citasAsignadas;
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
    
}
