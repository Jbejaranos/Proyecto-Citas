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
public class EjecutablePaneles extends javax.swing.JFrame {
    
    //NuevoUsuario nu = new NuevoUsuario();

    /**
     * Creates new form EjecutablePaneles
     */
    public EjecutablePaneles() {
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

        jPanel2 = new javax.swing.JPanel();
        Panel_variante = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        B_eliminar = new javax.swing.JButton();
        B_NuevoUsuario = new javax.swing.JButton();
        B_login = new javax.swing.JButton();
        crearCitasB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        Panel_variante.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel_varianteLayout = new javax.swing.GroupLayout(Panel_variante);
        Panel_variante.setLayout(Panel_varianteLayout);
        Panel_varianteLayout.setHorizontalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        Panel_varianteLayout.setVerticalGroup(
            Panel_varianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        B_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        B_eliminar.setText("Eliminar");
        B_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_eliminarActionPerformed(evt);
            }
        });

        B_NuevoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        B_NuevoUsuario.setText("Nuevo usuario");
        B_NuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_NuevoUsuarioActionPerformed(evt);
            }
        });

        B_login.setBackground(new java.awt.Color(255, 255, 255));
        B_login.setText("Login");
        B_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_loginActionPerformed(evt);
            }
        });

        crearCitasB.setBackground(new java.awt.Color(255, 255, 255));
        crearCitasB.setText("Crear citas");
        crearCitasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCitasBActionPerformed(evt);
            }
        });

        jButton1.setText("Graficas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(B_NuevoUsuario))
                    .addComponent(B_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearCitasB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(B_login)
                .addGap(18, 18, 18)
                .addComponent(B_NuevoUsuario)
                .addGap(18, 18, 18)
                .addComponent(B_eliminar)
                .addGap(18, 18, 18)
                .addComponent(crearCitasB)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_variante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_variante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_NuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_NuevoUsuarioActionPerformed
        // TODO add your handling code here:
//        jPanel1.setVisible(false);
//        jPanel1.removeAll();
//        jPanel1.add(nu);
//        jPanel1.setVisible(true);
        VentanaHome.controlSesion.restart();

     
        NuevoUsuario PR = new  NuevoUsuario();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_B_NuevoUsuarioActionPerformed

    private void B_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_eliminarActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        Eliminar_usuario PR = new  Eliminar_usuario();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_B_eliminarActionPerformed

    private void B_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_loginActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        Login PR = new  Login();
        PR.setSize(1000, 1000);
        PR.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(PR,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint();  
    }//GEN-LAST:event_B_loginActionPerformed

    private void crearCitasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCitasBActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        CrearCitas CC = new CrearCitas();
        CC.setSize(600, 600);
        CC.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(CC,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_crearCitasBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        Graficas CC = new Graficas();
        CC.setSize(600, 600);
        CC.setLocation(0,0);
        Panel_variante.removeAll();
        Panel_variante.add(CC,BorderLayout.CENTER);
        Panel_variante.revalidate();
        Panel_variante.repaint(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EjecutablePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjecutablePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjecutablePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjecutablePaneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjecutablePaneles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_NuevoUsuario;
    private javax.swing.JButton B_eliminar;
    private javax.swing.JButton B_login;
    private javax.swing.JPanel Panel_variante;
    private javax.swing.JButton crearCitasB;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
