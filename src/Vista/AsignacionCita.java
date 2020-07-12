/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cita;
import Modelo.Paciente;
import Modelo.Sistema;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jorge
 */
public class AsignacionCita extends javax.swing.JPanel {
    
    public static Sistema sistema = Vista.VentanaHome.Sistema_principal;
    private Paciente paciente;
    private ArrayList<Cita> citasDisponibles;
    private TableRowSorter busfiltro;
    private TableModel DefaultTableModel;

    /**
     * Creates new form AsignacionCita
     * @param paciente
     */
    public AsignacionCita(Paciente paciente) {
        initComponents();
        citasDisponibles = new ArrayList<>();
        this.paciente = paciente;
        
        DefaultTableModel model = (DefaultTableModel) citasTable.getModel();
        for(Cita c : sistema.getCitas()){
            if(c.getPaciente() == null){
                String fecha = CitasPaciente.getTextoFecha(c.getFecha());
                String especialidad = c.getEspecialidad();
                String medico = c.getMedico().getNombre();
                String lugar = c.getConsultorio().getSede();
                citasDisponibles.add(c);
                model.addRow(new Object[]{fecha, especialidad, medico, lugar});
            }
        }
        this.DefaultTableModel = model;
    }
    
    
    //filtro
    public void filtro() {
    //Obtenemos el valor del JTextField para el filtro
    String filtro = BuscarParametro.getText();
    // Identificamos cual es el JRadioButton seleccionado para filtrar el
    // resultado de acuerdo a los datos de la columna elegida
    if (jRFecha.isSelected()) {
        int columna = 0;
        
        busfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
    } else if (jREspecialidad.isSelected()) {
        int columna = 1;
        busfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
    } else if (jRMedico.isSelected()) {
        int columna = 2;
        busfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
    }
    else if (jRLugar.isSelected()) {
        int columna = 3;
        busfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bfiltro = new javax.swing.ButtonGroup();
        labelPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        citasTable = new javax.swing.JTable();
        labelInstr = new javax.swing.JLabel();
        mensajeError = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        detallesButton = new javax.swing.JButton();
        RegistrarseButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BuscarParametro = new javax.swing.JTextField();
        jRFecha = new javax.swing.JRadioButton();
        jREspecialidad = new javax.swing.JRadioButton();
        jRMedico = new javax.swing.JRadioButton();
        jRLugar = new javax.swing.JRadioButton();

        labelPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPanel.setText("Citas médicas disponibles");

        citasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Especialidad", "Médico", "Lugar"
            }
        ));
        jScrollPane1.setViewportView(citasTable);

        labelInstr.setText("Seleccione la cita en la cual desea registrarse");

        detallesButton.setText("Detalles");
        detallesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detallesButtonActionPerformed(evt);
            }
        });

        RegistrarseButton.setText("Registrarse");
        RegistrarseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(detallesButton)
                .addGap(130, 130, 130)
                .addComponent(RegistrarseButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detallesButton)
                    .addComponent(RegistrarseButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Buscar por:");

        BuscarParametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarParametroKeyTyped(evt);
            }
        });

        bfiltro.add(jRFecha);
        jRFecha.setText("Fecha");

        bfiltro.add(jREspecialidad);
        jREspecialidad.setText("Especialidad");

        bfiltro.add(jRMedico);
        jRMedico.setText("Médico");

        bfiltro.add(jRLugar);
        jRLugar.setText("Lugar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(mensajeError))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelInstr)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(labelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jRFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jREspecialidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRMedico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRLugar))
                            .addComponent(BuscarParametro))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelPanel)
                .addGap(18, 18, 18)
                .addComponent(labelInstr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRFecha)
                    .addComponent(jREspecialidad)
                    .addComponent(jRMedico)
                    .addComponent(jRLugar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(mensajeError)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseButtonActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        int seleccion = citasTable.getSelectedRow();
        if(seleccion != -1){
            for(Cita c : sistema.getCitas()){
                if(c.equals(citasDisponibles.get(seleccion))){
                    c.setPaciente(paciente);
                    paciente.getCitasRegistradas().add(c);
                    int modelIndex = citasTable.convertRowIndexToModel(seleccion);
                    DefaultTableModel model = (DefaultTableModel) citasTable.getModel();
                    model.removeRow(modelIndex);
                    citasDisponibles.remove(seleccion);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Ha sido registrado en la cita");
        }else{
            mensajeError.setText("Por favor seleccione una cita");
        }
    }//GEN-LAST:event_RegistrarseButtonActionPerformed

    private void detallesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detallesButtonActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
        int seleccion = citasTable.getSelectedRow();
        if(seleccion != -1){
            Cita cita = citasDisponibles.get(seleccion);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha = "Fecha: " + formato.format(cita.getFecha().getTime()) + "\n";
            int hour = cita.getFecha().get(Calendar.HOUR);
            int minute = cita.getFecha().get(Calendar.MINUTE);
            String horaDia = "";
            String minuto = "";
            String AM_PM = (cita.getFecha().get(Calendar.AM_PM) == 0) ? "AM" : "PM";
            if(hour < 10){
                horaDia = "0" + hour;
            }else{
                horaDia = "" + hour;
            }
            if(minute < 10){
                minuto = "0" + minute;
            }else{
                minuto = "" + minute;
            }
            String hora = "Hora: " + horaDia + ":" + minuto + " " + AM_PM + "\n";
            String medico = "Medico: " + cita.getMedico().getNombre() + "\n";
            String especialidad = "Especialidad: " + cita.getEspecialidad() + "\n";
            String consultorio = "Lugar: Consultorio " + cita.getConsultorio().getNumero() + ", sede " + cita.getConsultorio().getSede() + "\n";
            JOptionPane.showMessageDialog(null, fecha + hora + medico + especialidad + consultorio);
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione una cita");
        }
    }//GEN-LAST:event_detallesButtonActionPerformed

    private void BuscarParametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarParametroKeyTyped
     
    if (bfiltro.getSelection()==null) {
        evt.consume();
        JOptionPane.showMessageDialog(this, "seleccione una opción del filtro", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
    } else {
        BuscarParametro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(final KeyEvent e) {
         
                filtro();
            }
        });
        
        busfiltro = new TableRowSorter(DefaultTableModel);
        citasTable.setRowSorter(busfiltro);
    }
        
       
    }//GEN-LAST:event_BuscarParametroKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarParametro;
    private javax.swing.JButton RegistrarseButton;
    private javax.swing.ButtonGroup bfiltro;
    private javax.swing.JTable citasTable;
    private javax.swing.JButton detallesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jREspecialidad;
    private javax.swing.JRadioButton jRFecha;
    private javax.swing.JRadioButton jRLugar;
    private javax.swing.JRadioButton jRMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInstr;
    private javax.swing.JLabel labelPanel;
    private javax.swing.JLabel mensajeError;
    // End of variables declaration//GEN-END:variables
}
