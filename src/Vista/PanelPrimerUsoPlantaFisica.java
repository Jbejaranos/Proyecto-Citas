/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Consultorio;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class PanelPrimerUsoPlantaFisica extends javax.swing.JPanel {

    /**
     * Creates new form PanelPrimerUsoPlantaFisica
     */
    public PanelPrimerUsoPlantaFisica() {
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

        panelLabel = new javax.swing.JLabel();
        instrLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consulTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        panelLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panelLabel.setText("Planta Física");

        instrLabel.setText("A continuación podrá añadir registros de consultorios, de click en \"Siguiente\" al finalizar.");

        consulTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre", "Sede"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(consulTable);

        addBtn.setText("Añadir");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instrLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelLabel)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(265, 265, 265))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLabel)
                .addGap(18, 18, 18)
                .addComponent(instrLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        DefaultTableModel model = (DefaultTableModel) this.consulTable.getModel();
        model.addRow(new Object[]{0, "", ""});
    }//GEN-LAST:event_addBtnActionPerformed

    public ArrayList<Consultorio> getConsultorios(){
        ArrayList<Consultorio> consultorios = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) this.consulTable.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            int num = (int) model.getValueAt(i, 0);
            String nombre = (String) model.getValueAt(i, 1);
            String sede = (String) model.getValueAt(i, 2);
            Consultorio cons = new Consultorio(num, nombre, sede);
            consultorios.add(cons);
        }
        return consultorios;
    }
    
    public boolean comprobarInformacion(){
        DefaultTableModel model = (DefaultTableModel) this.consulTable.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            String num = Integer.toString((int) model.getValueAt(i, 0));
            String nombre = (String) model.getValueAt(i, 1);
            String sede = (String) model.getValueAt(i, 2);
            if(!(num.matches("[0-9]+") && !nombre.isEmpty() && !sede.isEmpty()))
                return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTable consulTable;
    private javax.swing.JLabel instrLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel panelLabel;
    // End of variables declaration//GEN-END:variables
}