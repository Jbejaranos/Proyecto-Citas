/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Paciente;
import Modelo.Sistema;
import static Modelo.Sistema.eliminarPaciente;
import static Modelo.Sistema.encontrarPaciente;

/**
 *
 * @author Alejandro Ortiz
 */
public class Eliminar_usuario extends javax.swing.JPanel {
    
    
    //Sistema system = Vista.VentanaHome.Sistema_principal;

    /**
     * Creates new form Eliminar_usuario
     */
    public Eliminar_usuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFDocumento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAInfo = new javax.swing.JTextArea();
        VerInfo = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        TFEstado = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Usuarios");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documento de usuario a eliminar");

        TFDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDocumentoActionPerformed(evt);
            }
        });

        TAInfo.setEditable(false);
        TAInfo.setColumns(20);
        TAInfo.setRows(5);
        jScrollPane1.setViewportView(TAInfo);

        VerInfo.setText("Ver info del usuario");
        VerInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInfoActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        TFEstado.setEditable(false);
        TFEstado.setBackground(new java.awt.Color(102, 204, 255));
        TFEstado.setForeground(new java.awt.Color(255, 255, 255));
        TFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(VerInfo)
                            .addComponent(Eliminar))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerInfo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TFDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDocumentoActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
    }//GEN-LAST:event_TFDocumentoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        Paciente pac1;
        //Sistema system = new Sistema();
        pac1 = encontrarPaciente(Integer.valueOf(TFDocumento.getText()),Vista.VentanaHome.Sistema_principal);
        if(pac1 != null){
            eliminarPaciente(Integer.valueOf(TFDocumento.getText()), Vista.VentanaHome.Sistema_principal);
            TFEstado.setText("Usuario eliminado con exito");
        }else{
            TFEstado.setText("No hay usuarios con el documento ingresado");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void TFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEstadoActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
    }//GEN-LAST:event_TFEstadoActionPerformed

    private void VerInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInfoActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        Paciente pac;
        //Sistema system = new Sistema();
        
        pac = encontrarPaciente(Integer.valueOf(TFDocumento.getText()),Vista.VentanaHome.Sistema_principal);
        
        if(pac != null){    //SI HAY UN USUARIO CON LA CEDULA DADA SE MUESTRA LA INFO
        TAInfo.setText(
        
            ("Nuevo usuario agregado\n" +
                "ID   " + pac.getIdentificacion() + "\n"+
                "Nombre   " + pac.getNombre() + "\n"+
                "Sexo   " + pac.getGenero() + "\n"+

                 //"Fecha de nacimiento  " + imprimir_horario(nacimiento) + //------------------------------------***************
                 "\n" )
            );
        }else{  //SI NO HAY COINCIDENCIA NO SE HACE NADA Y SE MUESTRA NOTIFICACION
            TAInfo.setText("No hay coincidencias para el documento ingresado.");
        }
    }//GEN-LAST:event_VerInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextArea TAInfo;
    private javax.swing.JTextField TFDocumento;
    private javax.swing.JTextField TFEstado;
    private javax.swing.JButton VerInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
