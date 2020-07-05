/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;

/**
 *
 * @author Alejandro Ortiz
 */
public class Panel_administrador extends javax.swing.JPanel {

    /**
     * Creates new form Panel_administrador
     */
    public Panel_administrador() {
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
        noticiaBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Crear_medico = new javax.swing.JButton();
        consultBtn = new javax.swing.JButton();
        reporteFallasBtn = new javax.swing.JButton();
        B_estadisticas = new javax.swing.JButton();
        mensajesBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 255));

        Panel_variante.setBackground(new java.awt.Color(0, 102, 255));

        noticiaBtn.setText("Cambiar Noticia");
        noticiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noticiaBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Crear Citas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Crear_medico.setText("Nuevo Medico");
        Crear_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_medicoActionPerformed(evt);
            }
        });

        consultBtn.setText("Consultorios");
        consultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultBtnActionPerformed(evt);
            }
        });

        reporteFallasBtn.setText("Reporte de fallas");
        reporteFallasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteFallasBtnActionPerformed(evt);
            }
        });

        B_estadisticas.setText("Estadisticas");
        B_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_estadisticasActionPerformed(evt);
            }
        });

        mensajesBtn.setText("Mensajes");
        mensajesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_varianteLayout = new javax.swing.GroupLayout(Panel_variante);
        Panel_variante.setLayout(Panel_varianteLayout);
        Panel_varianteLayout.setHorizontalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_varianteLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_varianteLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Crear_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_varianteLayout.createSequentialGroup()
                        .addComponent(B_estadisticas)
                        .addGap(38, 38, 38)
                        .addComponent(jButton3)
                        .addGap(40, 40, 40)
                        .addComponent(mensajesBtn))
                    .addComponent(noticiaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_varianteLayout.createSequentialGroup()
                        .addComponent(reporteFallasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 339, Short.MAX_VALUE))
                    .addGroup(Panel_varianteLayout.createSequentialGroup()
                        .addComponent(consultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Panel_varianteLayout.setVerticalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_varianteLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(Crear_medico)
                    .addComponent(reporteFallasBtn))
                .addGap(18, 18, 18)
                .addGroup(Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_estadisticas)
                    .addComponent(jButton3)
                    .addComponent(mensajesBtn)
                    .addComponent(consultBtn))
                .addGap(18, 18, 18)
                .addComponent(noticiaBtn)
                .addContainerGap(228, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        NuevoUsuario PR = new  NuevoUsuario();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        Eliminar_usuario PR = new  Eliminar_usuario();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        CrearCitas CC = new CrearCitas();
        CC.setSize(1000, 1000);
        //CC.setSize(510, 350);
        CC.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(CC,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Crear_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_medicoActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        NuevoMedico PR = new  NuevoMedico();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_Crear_medicoActionPerformed

    private void consultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultBtnActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        Consultorios CS = new Consultorios();
        CS.setSize(520, 341);
        CS.setLocation(0, 0);
        Panel_variante.removeAll();
        Panel_variante.add(CS, BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_consultBtnActionPerformed

    private void reporteFallasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteFallasBtnActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        ReporteFallasAdmin RA = new ReporteFallasAdmin();
        RA.setSize(600, 400);
        RA.setLocation(0, 0);
        Panel_variante.removeAll();
        Panel_variante.add(RA, BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_reporteFallasBtnActionPerformed

    private void B_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_estadisticasActionPerformed
        // TODO add your handling code here:
        
        VentanaHome.controlSesion.restart();
        Graficas RA = new Graficas();
        RA.setSize(650, 450);
        RA.setLocation(0, 0);
        Panel_variante.removeAll();
        Panel_variante.add(RA, BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
        
        
        
    }//GEN-LAST:event_B_estadisticasActionPerformed

    private void mensajesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajesBtnActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        CanalContactoAdmin CA = new CanalContactoAdmin();
        CA.setSize(677, 455);
        CA.setLocation(0, 0);
        Panel_variante.removeAll();
        Panel_variante.add(CA, BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_mensajesBtnActionPerformed

    private void noticiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noticiaBtnActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        ActualizarNoticiaPanel AN = new ActualizarNoticiaPanel();
        AN.setSize(955, 400);
        AN.setLocation(0, 0);
        Panel_variante.removeAll();
        Panel_variante.add(AN, BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_noticiaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_estadisticas;
    private javax.swing.JButton Crear_medico;
    private javax.swing.JPanel Panel_variante;
    private javax.swing.JButton consultBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton mensajesBtn;
    private javax.swing.JButton noticiaBtn;
    private javax.swing.JButton reporteFallasBtn;
    // End of variables declaration//GEN-END:variables
}
