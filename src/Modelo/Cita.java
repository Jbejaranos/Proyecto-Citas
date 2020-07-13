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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge
 */
@Entity
@Table (name="citas")
public class Cita implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numeroCita;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fecha;
    private Paciente paciente;
    private Medico medico;
    private Consultorio consultorio;
    @Column
    private String especialidad;
    @Column
    private boolean realizada;
    @Column
    private boolean pacienteAsistio;

    public Cita(Calendar fecha, Paciente paciente, Medico medico, Consultorio consultorio, String especialidad) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.especialidad = especialidad;
    }

    public int getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(int numeroCita) {
        this.numeroCita = numeroCita;
    }
    
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @ManyToOne
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @ManyToOne
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @OneToOne
    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public boolean isPacienteAsistio() {
        return pacienteAsistio;
    }

    public void setPacienteAsistio(boolean pacienteAsistio) {
        this.pacienteAsistio = pacienteAsistio;
    }
    
}
