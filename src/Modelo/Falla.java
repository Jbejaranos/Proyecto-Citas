/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Jorge
 */
public class Falla {
    private Calendar fecha;
    private Paciente usuario;
    private String componente;
    private String descripcion;

    public Falla(Calendar fecha, Paciente usuario, String componente, String descripcion) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.componente = componente;
        this.descripcion = descripcion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Paciente getUsuario() {
        return usuario;
    }

    public void setUsuario(Paciente usuario) {
        this.usuario = usuario;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
