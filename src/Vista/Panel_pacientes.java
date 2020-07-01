/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Paciente;
import java.awt.BorderLayout;

/**
 *
 * @author Alejandro Ortiz
 */
public class Panel_pacientes extends javax.swing.JPanel {

    /**
     * Creates new form Panel_pacientes
     */
    public Panel_pacientes() {
        initComponents();
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
        B_citas = new javax.swing.JButton();
        registroCitaButton = new javax.swing.JButton();
        reportFallaBtn = new javax.swing.JButton();
        B_mis_datos = new javax.swing.JButton();

        Panel_variante.setBackground(new java.awt.Color(102, 153, 255));

        B_citas.setText("Citas");
        B_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_citasActionPerformed(evt);
            }
        });

        registroCitaButton.setText("Registro cita");
        registroCitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroCitaButtonActionPerformed(evt);
            }
        });

        reportFallaBtn.setText("Reportar falla");
        reportFallaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportFallaBtnActionPerformed(evt);
            }
        });

        B_mis_datos.setText("Mis datos");
        B_mis_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_mis_datosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_varianteLayout = new javax.swing.GroupLayout(Panel_variante);
        Panel_variante.setLayout(Panel_varianteLayout);
        Panel_varianteLayout.setHorizontalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_varianteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(B_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registroCitaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(reportFallaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_mis_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        Panel_varianteLayout.setVerticalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_varianteLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registroCitaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportFallaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_mis_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_variante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_variante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_citasActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        CitasPaciente PR = new  CitasPaciente(Vista.Login.pac);
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_B_citasActionPerformed

    private void registroCitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroCitaButtonActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        AsignacionCita AC = new AsignacionCita(Vista.Login.pac);
        AC.setSize(1000, 1000);
        AC.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(AC ,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_registroCitaButtonActionPerformed

    private void B_mis_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_mis_datosActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        panelDatosUsuario AC = new panelDatosUsuario();
        AC.setSize(1000, 1000);
        AC.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(AC ,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_B_mis_datosActionPerformed

    private void reportFallaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportFallaBtnActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        ReportarFallaPaciente RF = new ReportarFallaPaciente();
        RF.setSize(600, 600);
        RF.setLocation(0, 0);
        RF.setParentPanel(this);
        Panel_variante.removeAll();
        Panel_variante.add(RF, BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_reportFallaBtnActionPerformed

    public void reset(){
        Panel_variante.removeAll();
        Panel_variante.add(B_citas);
        Panel_variante.add(B_mis_datos);
        Panel_variante.add(registroCitaButton);
        Panel_variante.add(reportFallaBtn);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_citas;
    private javax.swing.JButton B_mis_datos;
    private javax.swing.JPanel Panel_variante;
    private javax.swing.JButton registroCitaButton;
    private javax.swing.JButton reportFallaBtn;
    // End of variables declaration//GEN-END:variables
}
