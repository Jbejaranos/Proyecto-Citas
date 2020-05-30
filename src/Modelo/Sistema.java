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
public class Sistema {
    
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Administrador> administradores;
    private ArrayList<HistoriaClinica> historiasClinicas;
    private ArrayList<Cita> citas;
    private ArrayList<Consultorio> consultorios;
    
    public Sistema(){
        
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
    
    
    
    
       
    
    //*************************
    
   //METODOS ESTATICOS 
    
    
    public static void agregar_paciente(Paciente paciente, Sistema sistema){
        sistema.pacientes.add(paciente);
    }
    
    
    public static Paciente encontrar_paciente(long id, Sistema sistema){
        
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
    
    public static void eliminar_paciente (long id, Sistema sistema){
        Paciente paciente_borrar;
        paciente_borrar = encontrar_paciente(id, sistema);
        
        sistema.pacientes.remove(paciente_borrar);
    }
    
    //*************************
    
}
