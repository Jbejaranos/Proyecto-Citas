/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.AdministradorDAO;
import Modelo.Administrador;
import Modelo.Cita;
import Modelo.Consultorio;
import static Modelo.Encriptacion.encriptar;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Sistema;
import static Vista.Login.sesion;
import static Vista.NuevoUsuario.crear_horario;
import static Vista.TestScript.nacimiento;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Alejandro Ortiz
 */
public class VentanaHome extends javax.swing.JFrame {

    /**
     * Creates new form VentanaHome
     */
    
    public static Sistema Sistema_principal = new Sistema();
    public static ControlSesion controlSesion = ControlSesion.getControlSesion();
    
    
    
    
        public void BotonInicio(){
        
        switch(sesion){
            case "paciente":
                //Acceder seccion usuario
                        Panel_pacientes PR = new  Panel_pacientes();
                        PR.setSize(1000, 1000);
                        PR.setLocation(0,0);
                        Vista.VentanaHome.Panel_variante.removeAll();
                        Vista.VentanaHome.Panel_variante.add(PR,BorderLayout.CENTER);
                        Vista.VentanaHome.Panel_variante.revalidate();
                        Vista.VentanaHome.Panel_variante.repaint();
            break;
            
            case"medico":
                //Acceder seccion usuario
                        PanelMedico PM = new  PanelMedico();
                        PM.setSize(1000, 1000);
                        PM.setLocation(0,0);
                        Vista.VentanaHome.Panel_variante.removeAll();
                        Vista.VentanaHome.Panel_variante.add(PM,BorderLayout.CENTER);
                        Vista.VentanaHome.Panel_variante.revalidate();
                        Vista.VentanaHome.Panel_variante.repaint();
                
            break;
            
            default:
                
            break;
        }
    }
        
    
    public VentanaHome() {
        initComponents();
        Login PR = new  Login();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
        
        Panel_desarrollo.setVisible(false);
        controlSesion.start();
        protocoloPrimerUso();
        
        
        
        
        
        
         
        
        //--------------------------------------------------------------------------------------------------------------
        
        
     GregorianCalendar nacimiento = crear_horario(2000,7,5,0,0);
     GregorianCalendar fechacita = crear_horario(2020,8,10,7,0);
     
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
            Medico med = new Medico(i, "med"+i, encriptar("123"), "Femenino",nacimiento, "General");
            Sistema_principal.getMedicos().add(med);
         
            Consultorio con = new Consultorio( (int)i, "Consultorio "+i , "Sede Norte");
            Sistema_principal.getConsultorios().add(con);
            
            Paciente pac = new Paciente(i, "pac"+ i, encriptar("123"), "Masculino",nacimiento);
            Sistema_principal.getPacientes().add(pac);
        
            Cita cita = new Cita(fechacita, pac, med,con, "General");
            Sistema_principal.getCitas().add(cita);
            
            
        }
        
        
        
        for(long i = 100;i<160;i++){
            
        
        
        
        Medico med = new Medico(i, "med"+i, encriptar("123"), "Femenino",nacimiento, especialidades[(int)i%14]);
        Sistema_principal.getMedicos().add(med);
        
        Consultorio con = new Consultorio( (int)i, "Consultorio "+i , "Sede Norte");
        Sistema_principal.getConsultorios().add(con);
        
        Paciente pac = new Paciente(i, "pac"+ i, encriptar("123"), "Masculino",nacimiento);
        Sistema_principal.getPacientes().add(pac);
        
        Cita cita = new Cita(fechacita, pac, med,con, especialidades [(int)i%14]);
        Sistema_principal.getCitas().add(cita);
        }
        
        
        
        
        for(long i = 160;i<300;i++){
            

        Paciente pac = new Paciente(i, "pac"+ i, encriptar("123"), "Masculino",nacimiento);
        Sistema_principal.getPacientes().add(pac);
        }
        //-----------------------------------------------------------------------------------------------------------------
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_variante = new javax.swing.JPanel();
        Panel_desarrollo = new javax.swing.JPanel();
        crearUSUARIO = new javax.swing.JButton();
        Ir_login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        paciente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Admin = new javax.swing.JButton();
        Iniciar_una_sesion = new javax.swing.JButton();
        BotonIrHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout Panel_varianteLayout = new javax.swing.GroupLayout(Panel_variante);
        Panel_variante.setLayout(Panel_varianteLayout);
        Panel_varianteLayout.setHorizontalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        Panel_varianteLayout.setVerticalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        crearUSUARIO.setText("Agregar");
        crearUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUSUARIOActionPerformed(evt);
            }
        });

        Ir_login.setText("Login");
        Ir_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_loginActionPerformed(evt);
            }
        });

        jButton1.setText("+Citas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        paciente.setText("paciente");
        paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_desarrolloLayout = new javax.swing.GroupLayout(Panel_desarrollo);
        Panel_desarrollo.setLayout(Panel_desarrolloLayout);
        Panel_desarrolloLayout.setHorizontalGroup(
            Panel_desarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_desarrolloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_desarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearUSUARIO)
                    .addComponent(Ir_login)
                    .addComponent(jButton1)
                    .addComponent(paciente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_desarrolloLayout.setVerticalGroup(
            Panel_desarrolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_desarrolloLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(Ir_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearUSUARIO)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paciente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Admin.setText("Soy admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        Iniciar_una_sesion.setText("Iniciar sesion");
        Iniciar_una_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar_una_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Iniciar_una_sesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Iniciar_una_sesion)
                .addGap(29, 29, 29)
                .addComponent(Admin)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        BotonIrHome.setText("SystemSalud");
        BotonIrHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIrHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_variante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Panel_desarrollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BotonIrHome)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_variante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Panel_desarrollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonIrHome, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void protocoloPrimerUso(){
        // Falta revisar en la base de datos con el método checkAdminsEmpty() en la clase DAO
        if(Sistema_principal.getAdministradores().isEmpty()){
            PanelPrimerUso primerUso = new PanelPrimerUso();
            primerUso.setSize(1000, 1000);
            primerUso.setLocation(0,0);
            Panel_variante.removeAll();
            Panel_variante.add(primerUso, BorderLayout.CENTER);
            Panel_variante.revalidate();
            Panel_variante.repaint();
        }
    }
    
    public static void logIn(){
        Login PR = new  Login();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }
    
    private void crearUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUSUARIOActionPerformed
        // TODO add your handling code here:
        controlSesion.restart();
        NuevoUsuario PR = new  NuevoUsuario();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_crearUSUARIOActionPerformed

    private void Ir_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_loginActionPerformed
        // TODO add your handling code here:
        controlSesion.restart();
        Login PR = new  Login();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_Ir_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controlSesion.restart();
        CrearCitas PR = new  CrearCitas();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteActionPerformed
        // TODO add your handling code here:
        controlSesion.restart();
        Panel_pacientes PR = new  Panel_pacientes();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Vista.VentanaHome.Panel_variante.removeAll();
        Vista.VentanaHome.Panel_variante.add(PR,BorderLayout.CENTER);
        Vista.VentanaHome.Panel_variante.revalidate();
        Vista.VentanaHome.Panel_variante.repaint();
        
    }//GEN-LAST:event_pacienteActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
        controlSesion.restart();
        Panel_administrador PR = new  Panel_administrador();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Vista.VentanaHome.Panel_variante.removeAll();
        Vista.VentanaHome.Panel_variante.add(PR,BorderLayout.CENTER);
        Vista.VentanaHome.Panel_variante.revalidate();
        Vista.VentanaHome.Panel_variante.repaint();
    }//GEN-LAST:event_AdminActionPerformed

    private void Iniciar_una_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar_una_sesionActionPerformed
        // TODO add your handling code here:
        controlSesion.restart();
        Login PR = new  Login();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
        
    }//GEN-LAST:event_Iniciar_una_sesionActionPerformed

    private void BotonIrHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIrHomeActionPerformed
        // TODO add your handling code here:
        
        BotonInicio();
    }//GEN-LAST:event_BotonIrHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton BotonIrHome;
    private javax.swing.JButton Iniciar_una_sesion;
    private javax.swing.JButton Ir_login;
    private javax.swing.JPanel Panel_desarrollo;
    public static javax.swing.JPanel Panel_variante;
    private javax.swing.JButton crearUSUARIO;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton paciente;
    // End of variables declaration//GEN-END:variables
}
