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
import static Vista.NuevoUsuario.crear_horario;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Alejandro Ortiz
 */
public class Incapacidades extends javax.swing.JPanel {
    
    
    Paciente pac = null;
   Medico med = Vista.Login.med;
   ArrayList<Cita> citasRegistradas;
   Cita CitaACertificar = null;
   
   
public void generarPDF(String texto)throws FileNotFoundException,DocumentException{

Document document = new Document();
//String dir = imprimir_horario((GregorianCalendar)Calendar.getInstance()) + ".pdf";

PdfWriter.getInstance (document, new FileOutputStream("Incapacidad.pdf"));

document.open();

document.add(new Paragraph (texto));

document.close();
}



    public int switch_mes(String mes){
        int r = 1;
        
        switch (mes){
            
            case "Enero":
                r = 1;
                break;
                
            case "Febrero":
                r = 2;
                break;
                
            case "Marzo":
                r = 3;
                break;
                
            case "Abril":
                r = 4;
                break;
                
            case "Mayo":
                r = 5;
                break;
                
            case "Junio":
                r = 6;
                break;
                
            case "Julio":
                r = 7;
                break;
                
            case "Agosto":
                r = 8;
                break;
                
            case "Septiembre":
                r = 9;
                break;
                
            case "Octubre":
                r = 10;
                break;
                
            case "Noviembre":
                r = 11;
                break;
                
            case "Diciembre":
                r = 12;
                break;
                
        }
        
        return r;
    }
    
    
        public static GregorianCalendar crear_horario(int year,int month_1_12,int dayOfMonth,int hourOfDay24h,int minute){
        
        GregorianCalendar horario = new GregorianCalendar(year, month_1_12 - 1,dayOfMonth,hourOfDay24h, minute);
        return horario;
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
    
    
    
    public Incapacidades() {
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
        TA_justificacion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_fecha = new javax.swing.JTextField();
        TF_nombre = new javax.swing.JTextField();
        TF_DocPac = new javax.swing.JTextField();
        TF_NombrePac = new javax.swing.JTextField();
        B_buscar = new javax.swing.JButton();
        B_generar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Ainicio = new javax.swing.JComboBox<>();
        Dinicio = new javax.swing.JComboBox<>();
        Minicio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Afin = new javax.swing.JComboBox<>();
        Dfin = new javax.swing.JComboBox<>();
        Mfin = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TA_texto = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Emisión de incapacidades");

        TA_justificacion.setColumns(20);
        TA_justificacion.setRows(5);
        jScrollPane1.setViewportView(TA_justificacion);

        jLabel2.setText("En la carpeta del programa podra hallar el pdf generado");

        jLabel3.setText("Profesional: ");

        jLabel4.setText("Documento del Paciente: ");

        jLabel5.setText("Fecha  creación: ");

        jLabel6.setText("Nombre del paciente");

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

        B_buscar.setText("Buscar");
        B_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_buscarActionPerformed(evt);
            }
        });

        B_generar.setText("Generar Certificado");
        B_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_generarActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Aquí podrá generar certificados de incapacidad \ntemporal para los pacientes que lo requieran.\n");
        jScrollPane2.setViewportView(jTextArea1);

        Ainicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        Dinicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Minicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        Minicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinicioActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha inicio");

        Afin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        Dfin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Mfin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        Mfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MfinActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha fin");

        TA_texto.setEditable(false);
        TA_texto.setBackground(new java.awt.Color(241, 241, 241));
        TA_texto.setColumns(20);
        TA_texto.setRows(5);
        jScrollPane3.setViewportView(TA_texto);

        jLabel9.setText("Justificación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TF_DocPac)
                                            .addComponent(TF_NombrePac)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(B_buscar)
                                                    .addComponent(TF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TF_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Minicio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Dinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Afin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Mfin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Dfin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_generar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(130, 130, 130))
                                .addComponent(jScrollPane1)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGap(7, 7, 7)
                        .addComponent(B_buscar)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TF_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Afin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(B_generar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TF_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_fechaActionPerformed

    private void TF_DocPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_DocPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_DocPacActionPerformed

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
        
       
        GregorianCalendar FechaInicio = crear_horario(Integer.valueOf(Ainicio.getSelectedItem().toString()),
                                        Integer.valueOf(switch_mes(Minicio.getSelectedItem().toString())),
                                        Integer.valueOf(Dinicio.getSelectedItem().toString()),0,0);
        
         GregorianCalendar FechaFin = crear_horario(Integer.valueOf(Afin.getSelectedItem().toString()),
                                        Integer.valueOf(switch_mes(Mfin.getSelectedItem().toString())),
                                        Integer.valueOf(Dfin.getSelectedItem().toString()),24,0);
        
        //-------------------------------------------------------------------------------------------------------
        citasRegistradas = pac.getCitasRegistradas();
        
        int l = citasRegistradas.size();
        
        boolean found = false;
        for(int i =0;i<l && found == false;i++){
            
            //Hallar cita en que el paciente fue atendido por el medico autenticado
            if(citasRegistradas.get(i).getMedico().getIdentificacion() == med.getIdentificacion()){
                CitaACertificar = citasRegistradas.get(i);
                found = true;
                
            }
        }
        
        if(CitaACertificar == null){
            TA_justificacion.setText("El usuario no ha asistido a citas usted, Dr./Dra.");
        }else{
            
        //---------------------------------------------------------------------------------------------------------------------------
        
        long daysBetween = ChronoUnit.DAYS.between(FechaInicio.toInstant(), FechaFin.toInstant());
        
        String TextoOrden = 
                "______________________________________________________________________________"+
                imprimir_horario((GregorianCalendar)Calendar.getInstance()) 
                +"\n\n"+
                "El profesional " + med.getNombre()+ " emite certificado de incapacidad para el paciente  " + pac.getNombre() + 
                " identificado con el documento "+ pac.getIdentificacion() + " para el periodo comprendido entre " + 
                " el dia " + Dinicio.getSelectedItem().toString() +" del mes "+ Minicio.getSelectedItem().toString()+" en el año "+Ainicio.getSelectedItem().toString()+ " y "+
                " el dia " + Dfin.getSelectedItem().toString() +" del mes "+ Mfin.getSelectedItem().toString()+" en el año "+ Afin.getSelectedItem().toString() +
                " para un tiempo total de " + daysBetween +" dias."+
                
                "\n\nLas causas para emitir este certificado son:\n" + TA_justificacion.getText()
                +
                "\n\n\n\n\n\n Firma Médico: __________________________________"
                + "\n\n\n\n\n______________________________________________________________________________";
        
        TA_texto.setText(TextoOrden);
        
        try{
            generarPDF(TextoOrden);
        }catch(Exception e){
            
        }
        
        }
    }//GEN-LAST:event_B_generarActionPerformed

    private void MinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinicioActionPerformed
        // TODO add your handling code here:
        VentanaHome.controlSesion.restart();
    }//GEN-LAST:event_MinicioActionPerformed

    private void MfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MfinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Afin;
    private javax.swing.JComboBox<String> Ainicio;
    private javax.swing.JButton B_buscar;
    private javax.swing.JButton B_generar;
    private javax.swing.JComboBox<String> Dfin;
    private javax.swing.JComboBox<String> Dinicio;
    private javax.swing.JComboBox<String> Mfin;
    private javax.swing.JComboBox<String> Minicio;
    private javax.swing.JTextArea TA_justificacion;
    private javax.swing.JTextArea TA_texto;
    private javax.swing.JTextField TF_DocPac;
    private javax.swing.JTextField TF_NombrePac;
    private javax.swing.JTextField TF_fecha;
    private javax.swing.JTextField TF_nombre;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}