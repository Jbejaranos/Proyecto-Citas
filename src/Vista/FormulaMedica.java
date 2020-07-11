/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cita;
import Modelo.Medico;
import static Modelo.Sistema.encontrarPaciente;
import com.itextpdf.text.DocumentException;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


import java.io.FileOutputStream;

import com.itextpdf.text.Document;

import com.itextpdf.text.DocumentException;

import com.itextpdf.text.Paragraph; 

import com.itextpdf.text.pdf.PdfWriter; 

 import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import Modelo.Paciente;
/**
 *
 * @author Alejandro Ortiz
 */
public class FormulaMedica extends javax.swing.JPanel {
    
    
    Paciente pac = null;
   Medico med = Vista.Login.med;
    
public void generarPDF(String texto)throws FileNotFoundException,DocumentException{

Document document = new Document();
//String dir = imprimir_horario((GregorianCalendar)Calendar.getInstance()) + ".pdf";

PdfWriter.getInstance (document, new FileOutputStream("Formula.pdf"));

document.open();

document.add(new Paragraph (texto));

document.close();
}


    /**
     * Creates new form Graficas
     */
    
    
    /*
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Administrador> administradores;
    private ArrayList<HistoriaClinica> historiasClinicas;
    private ArrayList<Cita> citas;
    private ArrayList<Consultorio> consultorios;
    */
    




    public String imprimir_horario(GregorianCalendar horario){
        int year = horario.get(Calendar.YEAR);
        int mes = horario.get(Calendar.MONTH) + 1 ; 
        int dia = horario.get(Calendar.DAY_OF_MONTH); 
        int hora = horario.get(Calendar.HOUR_OF_DAY);
        int minuto = horario.get(Calendar.MINUTE);
        
        return  "[ " + year + " / " + mes + " / " + dia + " - " + hora + " : " + minuto
                //+ " / " + hora + " : " + minuto 
                + " ]" ;
    }
    
    
    
    public FormulaMedica() {
        initComponents();
        
        
        //Cargar nombre del doctor y la fecha
        
        TF_nombre.setText("" + med.getNombre());
        TF_fecha.setText(imprimir_horario((GregorianCalendar)Calendar.getInstance()));
        

        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Formula = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CB_tipo = new javax.swing.JComboBox<>();
        TF_fecha = new javax.swing.JTextField();
        TF_nombre = new javax.swing.JTextField();
        TF_DocPac = new javax.swing.JTextField();
        TF_NombrePac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NombreReceta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TF_periodicidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TF_duracion = new javax.swing.JTextField();
        B_buscar = new javax.swing.JButton();
        B_generar = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Emisión de órdenes y formulas");

        TA_Formula.setEditable(false);
        TA_Formula.setColumns(20);
        TA_Formula.setRows(5);
        jScrollPane1.setViewportView(TA_Formula);

        jLabel2.setText("En la carpeta del programa podra hallar el pdf generado");

        jLabel3.setText("Profesional: ");

        jLabel4.setText("Documento del Paciente: ");

        jLabel5.setText("Fecha: ");

        jLabel6.setText("Nombre del paciente");

        jLabel7.setText("Tipo: ");

        CB_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicamento", "Pruducto" }));

        TF_fecha.setEditable(false);
        TF_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_fechaActionPerformed(evt);
            }
        });

        TF_nombre.setEditable(false);

        TF_DocPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_DocPacActionPerformed(evt);
            }
        });

        TF_NombrePac.setEditable(false);

        jLabel8.setText("Nombre y cantidad: ");

        NombreReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreRecetaActionPerformed(evt);
            }
        });

        jLabel9.setText("Periodicidad:");

        jLabel10.setText("Duración:");

        B_buscar.setText("Buscar");
        B_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_buscarActionPerformed(evt);
            }
        });

        B_generar.setText("Generar Orden");
        B_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_generarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_DocPac)
                            .addComponent(TF_NombrePac)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TF_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CB_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TF_fecha)
                                            .addComponent(NombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(TF_periodicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(B_buscar)
                                    .addComponent(TF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B_generar))
                                .addGap(0, 16, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_DocPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TF_NombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TF_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(CB_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(NombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_periodicidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TF_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(B_generar)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TF_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_fechaActionPerformed

    private void TF_DocPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_DocPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_DocPacActionPerformed

    private void NombreRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreRecetaActionPerformed

    private void B_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_buscarActionPerformed
        // TODO add your handling code here:
        
        //Cargar paciente
        int doc =  Integer.valueOf(TF_DocPac.getText());
        try{
        pac = encontrarPaciente(doc,Vista.VentanaHome.Sistema_principal);
        TF_NombrePac.setText(pac.getNombre());
        }catch(Exception e){
            TF_NombrePac.setText("No hay ususario con el documento");
        }
        
        
    }//GEN-LAST:event_B_buscarActionPerformed

    private void B_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_generarActionPerformed
        // TODO add your handling code here:
        
        String tipo = CB_tipo.getSelectedItem().toString();
        String Nombre_medicamento_o_producto = NombreReceta.getText();
        String periodicidad = TF_periodicidad.getText();
        String duracion = TF_duracion.getText();
        
        
        String TextoOrden = 
                "______________________________________________________________________________"+
                imprimir_horario((GregorianCalendar)Calendar.getInstance()) 
                +"\n\n"+
                "El profesional " + med.getNombre()+ " receto al paciente " + pac.getNombre() + 
                " identificado con el documento "+ pac.getIdentificacion() + " el " + tipo + " " + Nombre_medicamento_o_producto +"" +
                " para su entrega con periodicidad "+periodicidad + ", para su uso durante " + duracion +
                "\n\n\n\n\n\n Firma Médico: __________________________________"
                + "\n\n\n\n\n______________________________________________________________________________";
        
        TA_Formula.setText(TextoOrden);
        
        try{
            generarPDF(TextoOrden);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_B_generarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_buscar;
    private javax.swing.JButton B_generar;
    private javax.swing.JComboBox<String> CB_tipo;
    private javax.swing.JTextField NombreReceta;
    private javax.swing.JTextArea TA_Formula;
    private javax.swing.JTextField TF_DocPac;
    private javax.swing.JTextField TF_NombrePac;
    private javax.swing.JTextField TF_duracion;
    private javax.swing.JTextField TF_fecha;
    private javax.swing.JTextField TF_nombre;
    private javax.swing.JTextField TF_periodicidad;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
