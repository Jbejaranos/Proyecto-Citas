/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jorge
 */
public class Sistema {
    
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Administrador> administradores;
    private ArrayList<HistoriaClinica> historiasClinicas;
    private ArrayList<Cita> citas;
    private ArrayList<Consultorio> consultorios;
    
    public Sistema(){
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
        administradores = new ArrayList<>();
        historiasClinicas = new ArrayList<>();
        citas = new ArrayList<>();
        consultorios = new ArrayList<>();
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    public ArrayList<HistoriaClinica> getHistoriasClinicas() {
        return historiasClinicas;
    }

    public void setHistoriasClinicas(ArrayList<HistoriaClinica> historiasClinicas) {
        this.historiasClinicas = historiasClinicas;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    public ArrayList<Consultorio> getConsultorios() {
        return consultorios;
    }

    public void setConsultorios(ArrayList<Consultorio> consultorios) {
        this.consultorios = consultorios;
    }
    
    public void setPacienteNoAsiste(Cita cita, boolean estado){
        cita.setPacienteAsistio(estado);
        cita.getPaciente().addSancion();
    }
    
    public static void addCita(int dia, int mes, int year, int hora, int minuto, String especialidad, long idMedico, Consultorio consultorio, Sistema sistema){
        boolean check = true;
        Medico medico = null;
        if(idMedico != -1){
            for(Medico m: sistema.medicos){
                if(m.getIdentificacion() == idMedico){
                    medico = m; break;
                }
            }
        }
        
        Calendar fecha = new GregorianCalendar(year, mes - 1, dia, hora, minuto);
        Cita cita = new Cita(fecha, null, medico, consultorio, especialidad);
        for(Cita c: sistema.citas){
            if(c.equals(cita)){
                check = false; break;
            }
        }
        if(check){
            sistema.citas.add(cita);
        }else{
            System.out.println("La cita ya exite");
        }
    }
    
    public static void addCitasDia(int dia, int mes, int year, int horaInicio, String especialidad, Sistema sistema){
        for(int i = horaInicio; i <= 17; i++){
            addCita(dia, mes, year, i, 0, especialidad, -1, sistema.consultorios.get(0), sistema);
            addCita(dia, mes, year, i, 30, especialidad, -1, sistema.consultorios.get(0), sistema);
        }
    }
    
    public static void addCitasDia(int dia, int mes, int year, int horaInicio, String especialidad, long idMedico, Sistema sistema){
        for(int i = horaInicio; i <= 17; i++){
            addCita(dia, mes, year, i, 0, especialidad, idMedico, sistema.consultorios.get(0), sistema);
            addCita(dia, mes, year, i, 30, especialidad, idMedico, sistema.consultorios.get(0), sistema);
        }
    }
    
    public static void addCitasSemana(int diaInicio, int diaSemana, int mes, int year, String especialidad, Sistema sistema){
        int diasMes = getDiasMes(mes);
        int dia = diaInicio;
        int m = mes, y = year;
        for(int i = diaSemana; i <= Calendar.FRIDAY; i++){
            if(dia == diasMes + 1){
                m++;
                if(m == 12){
                    y++;
                    m = 0;
                }
                dia = 1;
            }
            addCitasDia(dia, m, y, 7, especialidad, sistema);
        }
    }
    
    public static void addCitasSemana(int diaInicio, int diaSemana, int mes, int year, String especialidad, long idMedico, Sistema sistema){
        int diasMes = getDiasMes(mes);
        int dia = diaInicio;
        int m = mes, y = year;
        for(int i = diaSemana; i <= Calendar.FRIDAY; i++){
            if(dia == diasMes + 1){
                m++;
                if(m == 12){
                    y++;
                    m = 0;
                }
                dia = 1;
            }
            addCitasDia(dia, m, y, 7, especialidad, idMedico, sistema);
        }
    }
    
    public static int getDiasMes(int mes){
        switch (mes) {
            case Calendar.JANUARY:
            case Calendar.MARCH:
            case Calendar.MAY:
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.OCTOBER:
            case Calendar.DECEMBER:
                return 31;
            case Calendar.APRIL:
            case Calendar.JUNE:
            case Calendar.SEPTEMBER:
            case Calendar.NOVEMBER:
                return 30;
            default:
                return 28;
        }
    }
       
    
    //*************************
    
   //METODOS ESTATICOS 
    
    
    public static void agregarPaciente(Paciente paciente, Sistema sistema){
        sistema.pacientes.add(paciente);
    }
    
    
    public static void agregarMedico(Medico medico, Sistema sistema){
        sistema.medicos.add(medico);
    }
    
    
    public static Paciente encontrarPaciente(long id, Sistema sistema){
        
        Paciente paciente_comparar;
        
        int l = sistema.pacientes.size();
        
        for(int i = 0;i<l; i++){
            paciente_comparar = sistema.pacientes.get(i);
            if(paciente_comparar.getIdentificacion() == id){
                return paciente_comparar;
            }
        }
        return null;
    }
    
    public static void eliminarPaciente (long id, Sistema sistema){
        Paciente paciente_borrar;
        paciente_borrar = encontrarPaciente(id, sistema);
        
        sistema.pacientes.remove(paciente_borrar);
    }
    
    public static Medico encontrarMedico(long id, Sistema sistema){
        
        Medico medicoComparar;
        
        int l = sistema.medicos.size();
        
        for(int i = 0;i<l; i++){
            medicoComparar = sistema.medicos.get(i);
            if(medicoComparar.getIdentificacion() == id){
                return medicoComparar;
            }
        }
        return null;
    }
    
    //*************************
    
}
