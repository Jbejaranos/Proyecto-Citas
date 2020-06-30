/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDAO;


/**
 *
 * @author USER
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import DAO.*;
import Modelo.*;
import java.util.Calendar;

public class JunitDAO {
    
    private static AdministradorDAO adminDAO = new AdministradorDAO();
    private static CitaDAO citaDAO = new CitaDAO();
    private static ConsultorioDAO consDAO = new ConsultorioDAO();
    private static HistoriaClinicaDAO histDAO = new HistoriaClinicaDAO();
    private static MedicoDAO medDAO = new MedicoDAO();
    private static PacienteDAO pacDAO = new PacienteDAO();
    
    private static Medico med = new Medico(21,"House","12345","M",null,"General");
    private static Paciente pac = new Paciente(11,"Pepito","12345","M",null);
    private static Administrador admin = new Administrador(31,"Alejo","12345","M",null);
    private static Consultorio con = new Consultorio(101, "f", "Sede");
    private static Cita ct = new Cita(null,pac,med,con,"General");
    private static HistoriaClinica hc = new HistoriaClinica(null,pac,null);
    
    
    public JunitDAO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        pac.setHistoriaClinica(hc);
        //med.asignarCita(ct);
        //pac.asignarCita(ct);
        
        adminDAO.crearAdministrador(admin);
        citaDAO.crearCita(ct);
        consDAO.crearConsultorio(con);
        histDAO.crearHistoriaClinica(hc);
        medDAO.crearMedico(med);
        pacDAO.crearPaciente(pac);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testLecturaAdmin() {
        Administrador ts = adminDAO.leerAdministrador(31);
        assertEquals(ts,admin);
    }
    
}
