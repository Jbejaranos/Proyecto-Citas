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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Crear_medico = new javax.swing.JButton();
        consultBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 102, 255));

        Panel_variante.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout Panel_varianteLayout = new javax.swing.GroupLayout(Panel_variante);
        Panel_variante.setLayout(Panel_varianteLayout);
        Panel_varianteLayout.setHorizontalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
        Panel_varianteLayout.setVerticalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Crear_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(Crear_medico)
                    .addComponent(consultBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_variante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        CS.setSize(1000, 1000);
        CS.setLocation(0, 0);
        Panel_variante.removeAll();
        Panel_variante.add(CS, BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();
    }//GEN-LAST:event_consultBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear_medico;
    private javax.swing.JPanel Panel_variante;
    private javax.swing.JButton consultBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
