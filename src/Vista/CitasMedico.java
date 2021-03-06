/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.VentanaHome.Sistema_principal;
import Modelo.*;
import static Vista.CitasPaciente.getTextoFecha;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Calendar;
/**
 *
 * @author USER
 */
public class CitasMedico extends javax.swing.JPanel {

    private Medico md;
    /**
     * Creates new form CitasMedico
     */
    public CitasMedico(Medico med) {
        this.md = med;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHorario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BVer = new javax.swing.JButton();
        TFSemana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFYear = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 51));
        setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel1.setText("Horario del Medico");

        TablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7", null, null, null, null, null, null},
                {"8", null, null, null, null, null, null},
                {"9", null, null, null, null, null, null},
                {"10", null, null, null, null, null, null},
                {"11", null, null, null, null, null, null},
                {"12", null, null, null, null, null, null},
                {"13", null, null, null, null, null, null},
                {"14", null, null, null, null, null, null},
                {"15", null, null, null, null, null, null},
                {"16", null, null, null, null, null, null},
                {"17", null, null, null, null, null, null},
                {"18", null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaHorario);

        jLabel2.setText("Escriba el numero de semana:");

        BVer.setBackground(new java.awt.Color(0, 102, 0));
        BVer.setText("Ver Horario");
        BVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerActionPerformed(evt);
            }
        });

        TFSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSemanaActionPerformed(evt);
            }
        });

        jLabel3.setText("Escriba el año:");

        TFYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(BVer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFYear)
                            .addComponent(TFSemana, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(BVer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TFSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSemanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSemanaActionPerformed

    private void BVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerActionPerformed
        // TODO add your handling code here:
        String sem = TFSemana.getText();
        String yrr = TFYear.getText();
        int semn;
        int yr;
        try{
            semn = Integer.parseInt(sem);
            yr = Integer.parseInt(yrr);
            generarHorario(semn,yr);
        } catch (NumberFormatException e){
            JFrame parent = new JFrame();
            JOptionPane.showMessageDialog(parent, "Texto ingresado no es un numero.","Entrada inválida",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BVerActionPerformed

    private void TFYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFYearActionPerformed

    private void generarHorario(int semana,int year){
        if (md.getCitasAsignadas()!=null){
            for(Cita i : md.getCitasAsignadas()){
                if (i.getFecha().get(Calendar.WEEK_OF_YEAR)==semana && i.getFecha().get(Calendar.YEAR)==year){
                    DefaultTableModel model = (DefaultTableModel) TablaHorario.getModel();
                    String data = i.getConsultorio().toString();
                    switch (i.getFecha().get(Calendar.DAY_OF_WEEK)){
                        case Calendar.MONDAY:
                            switch (i.getFecha().get(Calendar.HOUR_OF_DAY)){
                                case 7:
                                    model.setValueAt(data, 0, 1);
                                    break;
                                case 8:
                                    model.setValueAt(data, 1, 1);
                                    break;
                                case 9:
                                    model.setValueAt(data, 2, 1);
                                    break;
                                case 10:
                                    model.setValueAt(data, 3, 1);
                                    break;
                                case 11:
                                    model.setValueAt(data, 4, 1);
                                    break;
                                case 12:
                                    model.setValueAt(data, 5, 1);
                                    break;
                                case 13:
                                    model.setValueAt(data, 6, 1);
                                    break;
                                case 14:
                                    model.setValueAt(data, 7, 1);
                                    break;
                                case 15:
                                    model.setValueAt(data, 8, 1);
                                    break;
                                case 16:
                                    model.setValueAt(data, 9, 1);
                                    break;
                                case 17:
                                    model.setValueAt(data, 10, 1);
                                    break;
                                case 18:
                                    model.setValueAt(data, 11, 1);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case Calendar.TUESDAY:
                            switch (i.getFecha().get(Calendar.HOUR_OF_DAY)){
                                case 7:
                                    model.setValueAt(data, 0, 2);
                                    break;
                                case 8:
                                    model.setValueAt(data, 1, 2);
                                    break;
                                case 9:
                                    model.setValueAt(data, 2, 2);
                                    break;
                                case 10:
                                    model.setValueAt(data, 3, 2);
                                    break;
                                case 11:
                                    model.setValueAt(data, 4, 2);
                                    break;
                                case 12:
                                    model.setValueAt(data, 5, 2);
                                    break;
                                case 13:
                                    model.setValueAt(data, 6, 2);
                                    break;
                                case 14:
                                    model.setValueAt(data, 7, 2);
                                    break;
                                case 15:
                                    model.setValueAt(data, 8, 2);
                                    break;
                                case 16:
                                    model.setValueAt(data, 9, 2);
                                    break;
                                case 17:
                                    model.setValueAt(data, 10, 2);
                                    break;
                                case 18:
                                    model.setValueAt(data, 11, 2);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case Calendar.WEDNESDAY:
                            switch (i.getFecha().get(Calendar.HOUR_OF_DAY)){
                                case 7:
                                    model.setValueAt(data, 0, 3);
                                    break;
                                case 8:
                                    model.setValueAt(data, 1, 3);
                                    break;
                                case 9:
                                    model.setValueAt(data, 2, 3);
                                    break;
                                case 10:
                                    model.setValueAt(data, 3, 3);
                                    break;
                                case 11:
                                    model.setValueAt(data, 4, 3);
                                    break;
                                case 12:
                                    model.setValueAt(data, 5, 3);
                                    break;
                                case 13:
                                    model.setValueAt(data, 6, 3);
                                    break;
                                case 14:
                                    model.setValueAt(data, 7, 3);
                                    break;
                                case 15:
                                    model.setValueAt(data, 8, 3);
                                    break;
                                case 16:
                                    model.setValueAt(data, 9, 3);
                                    break;
                                case 17:
                                    model.setValueAt(data, 10, 3);
                                    break;
                                case 18:
                                    model.setValueAt(data, 11, 3);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case Calendar.THURSDAY:
                            switch (i.getFecha().get(Calendar.HOUR_OF_DAY)){
                                case 7:
                                    model.setValueAt(data, 0, 4);
                                    break;
                                case 8:
                                    model.setValueAt(data, 1, 4);
                                    break;
                                case 9:
                                    model.setValueAt(data, 2, 4);
                                    break;
                                case 10:
                                    model.setValueAt(data, 3, 4);
                                    break;
                                case 11:
                                    model.setValueAt(data, 4, 4);
                                    break;
                                case 12:
                                    model.setValueAt(data, 5, 4);
                                    break;
                                case 13:
                                    model.setValueAt(data, 6, 4);
                                    break;
                                case 14:
                                    model.setValueAt(data, 7, 4);
                                    break;
                                case 15:
                                    model.setValueAt(data, 8, 4);
                                    break;
                                case 16:
                                    model.setValueAt(data, 9, 4);
                                    break;
                                case 17:
                                    model.setValueAt(data, 10, 4);
                                    break;
                                case 18:
                                    model.setValueAt(data, 11, 4);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case Calendar.FRIDAY:
                            switch (i.getFecha().get(Calendar.HOUR_OF_DAY)){
                                case 7:
                                    model.setValueAt(data, 0, 5);
                                    break;
                                case 8:
                                    model.setValueAt(data, 1, 5);
                                    break;
                                case 9:
                                    model.setValueAt(data, 2, 5);
                                    break;
                                case 10:
                                    model.setValueAt(data, 3, 5);
                                    break;
                                case 11:
                                    model.setValueAt(data, 4, 5);
                                    break;
                                case 12:
                                    model.setValueAt(data, 5, 5);
                                    break;
                                case 13:
                                    model.setValueAt(data, 6, 5);
                                    break;
                                case 14:
                                    model.setValueAt(data, 7, 5);
                                    break;
                                case 15:
                                    model.setValueAt(data, 8, 5);
                                    break;
                                case 16:
                                    model.setValueAt(data, 9, 5);
                                    break;
                                case 17:
                                    model.setValueAt(data, 10, 5);
                                    break;
                                case 18:
                                    model.setValueAt(data, 11, 5);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case Calendar.SATURDAY:
                            switch (i.getFecha().get(Calendar.HOUR_OF_DAY)){
                                case 7:
                                    model.setValueAt(data, 0, 6);
                                    break;
                                case 8:
                                    model.setValueAt(data, 1, 6);
                                    break;
                                case 9:
                                    model.setValueAt(data, 2, 6);
                                    break;
                                case 10:
                                    model.setValueAt(data, 3, 6);
                                    break;
                                case 11:
                                    model.setValueAt(data, 4, 6);
                                    break;
                                case 12:
                                    model.setValueAt(data, 5, 6);
                                    break;
                                case 13:
                                    model.setValueAt(data, 6, 6);
                                    break;
                                case 14:
                                    model.setValueAt(data, 7, 6);
                                    break;
                                case 15:
                                    model.setValueAt(data, 8, 6);
                                    break;
                                case 16:
                                    model.setValueAt(data, 9, 6);
                                    break;
                                case 17:
                                    model.setValueAt(data, 10, 6);
                                    break;
                                case 18:
                                    model.setValueAt(data, 11, 6);
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case Calendar.SUNDAY:
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVer;
    private javax.swing.JTextField TFSemana;
    private javax.swing.JTextField TFYear;
    private javax.swing.JTable TablaHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
