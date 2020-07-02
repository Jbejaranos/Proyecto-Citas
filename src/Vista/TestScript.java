/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cita;
import Modelo.Consultorio;
import Modelo.Medico;
import java.util.Calendar;

/**
 *
 * @author Alejandro Ortiz
 */
import Modelo.Paciente;
import static Vista.Login.med;
import static Vista.NuevoUsuario.crear_horario;
import java.util.GregorianCalendar;
public class TestScript {
    
    
    static GregorianCalendar nacimiento = crear_horario(2000,7,5,0,0);
     static GregorianCalendar fechacita = crear_horario(2020,8,10,7,0);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Paciente(long identificacion, String nombre, String password, String genero, Calendar fechaNacimiento)
        
        
        //--------------------------------------------------------------------------------------------------------------
        
        
        String[] especialidades = {   //24 max index
        
            "General",
            "Alergología",
            "Anestesiología",
            "Cardiología",
            "Gastroenterología",
            "Endocrinología",
            "Epidemiología",
            "Geriatría",
            "Hepatología",
            "Hematología",
            "Infectología",
            "Medicina familiar y comunitaria",
            "Medicina física y rehabilitación",
            "Medicina intensiva",
            "Medicina interna",
            "Medicina preventiva y salud pública",
            "Nefrología",
            "Neumología",
            "Neurología",
            "Nutriología",
            "Oncología",
            "Pediatría",
            "Psiquiatría",
            "Reumatología",
            "Toxicología" 
        };
                
                
        for(long i = 0;i<100;i++){
            Medico med = new Medico(i, "med"+i, "123", "Femenino",nacimiento, "General");
            Consultorio con = new Consultorio( (int)i, "Consultorio "+i , "Sede Norte");
            Paciente pac = new Paciente(i, "pac"+ i, "123", "Masculino",nacimiento);
        
        
            Cita cita = new Cita(fechacita, pac, med,con, "General");
        }
        
        
        
        for(long i = 100;i<160;i++){
            
        
        
        
        Medico med = new Medico(i, "med"+i, "123", "Femenino",nacimiento, especialidades[(int)i%14]);
        Consultorio con = new Consultorio( (int)i, "Consultorio "+i , "Sede Norte");
        Paciente pac = new Paciente(i, "pac"+ i, "123", "Masculino",nacimiento);
        
        
        Cita cita = new Cita(fechacita, pac, med,con, especialidades [(int)i%14]);
        
        }
        
        
        
        
        for(long i = 160;i<200;i++){
            

        Paciente pac = new Paciente(i, "pac"+ i, "123", "Masculino",nacimiento);
        
        }
        //-----------------------------------------------------------------------------------------------------------------
        
    }
    
}
