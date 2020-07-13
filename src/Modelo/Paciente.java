/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name="pacientes")
public class Paciente extends Persona implements java.io.Serializable {
    
    private ArrayList<Cita> citasRegistradas;
    @OneToOne(mappedBy = "paciente")
    private HistoriaClinica historiaClinica;
    private int sanciones;
    
    public Paciente(long identificacion, String nombre, String password, String genero, Calendar fechaNacimiento) {
        super(identificacion, nombre, password, genero, fechaNacimiento);
        this.sanciones = 0;
        this.citasRegistradas = new ArrayList<Cita>();
    }

    public Paciente(long identificacion, String nombre, String password, String genero, Calendar fechaNacimiento, HistoriaClinica hist) {
        super(identificacion, nombre, password, genero, fechaNacimiento);
        this.sanciones = 0;
        this.citasRegistradas = new ArrayList<Cita>();
        this.historiaClinica = hist;
    }
    
    public ArrayList<Cita> getCitasRegistradas() {
        return citasRegistradas;
    }

    public void setCitasRegistradas(ArrayList<Cita> citasRegistradas) {
        this.citasRegistradas = citasRegistradas;
    }
    
    public void addCita(Cita cita) {
        this.citasRegistradas.add(cita);
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public int getSanciones() {
        return sanciones;
    }

    public void addSancion() {
        this.sanciones++;
    }
    
    public boolean cancelarCita(Calendar fecha){
        boolean ret = false;
        for(Cita c: citasRegistradas){
            if(c.getFecha() == fecha && !c.isRealizada()){
                this.citasRegistradas.remove(c);
                ret = true;
                break;
            }
        }
        if(ret){
            Calendar dateNow = Calendar.getInstance();
            
            int diferencia_anual = fecha.get(Calendar.YEAR) - dateNow.get(Calendar.YEAR);
            int diferencia_meses = fecha.get(Calendar.MONTH) - dateNow.get(Calendar.MONTH);
            int diferencia_dias = fecha.get(Calendar.DAY_OF_MONTH) - dateNow.get(Calendar.DAY_OF_MONTH);
            int diferencia_horas = Math.abs(fecha.get(Calendar.HOUR_OF_DAY) - dateNow.get(Calendar.HOUR_OF_DAY));
            int diferencia_min = fecha.get(Calendar.MINUTE) - dateNow.get(Calendar.MINUTE);
            
            if(diferencia_anual > 0 || diferencia_meses > 0 || (diferencia_dias > 0 && 24 - diferencia_horas > 12)){
                System.out.println("Cita cancelada en el intervalo adecuado");
            }else if(diferencia_horas < 12){
                this.sanciones++;
                System.out.println("La cita no ha sido cancelada en el intervalo adecuado");
            }else if(diferencia_horas == 12){
                if(diferencia_min < 0){
                    this.sanciones++;
                    System.out.println("La cita no ha sido cancelada en el intervalo adecuado");
                }else{
                    System.out.println("Cita cancelada en el intervalo adecuado");
                }
            }
        }
        return ret;
    }
    
}
