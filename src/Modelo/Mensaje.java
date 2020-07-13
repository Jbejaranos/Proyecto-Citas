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
public class Mensaje implements java.io.Serializable {
    private long idRemitente;
    private long idDestinatario;
    private Calendar fecha;
    private String mensaje;

    public Mensaje(long idRemitente, long idDestinatario, Calendar fecha, String mensaje) {
        this.idRemitente = idRemitente;
        this.idDestinatario = idDestinatario;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    public long getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(long idRemitente) {
        this.idRemitente = idRemitente;
    }

    public long getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(long idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
