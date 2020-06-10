/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Medico;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import Modelo.Paciente;
import Modelo.Sistema;

/**
 *
 * @author Alejandro Ortiz
 */
public class NuevoMedico extends javax.swing.JPanel {
    
    //Sistema system = Vista.VentanaHome.Sistema_principal;
    //Atributos a leer.
    int documento;
    String nombre;
    String sexo;
    String clave; 
    
    String especialidad;
    GregorianCalendar nacimiento;
    
    Calendar fecha_actual = Calendar.getInstance();
            
   

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoMedico() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFDocumento = new javax.swing.JTextField();
        TFNombre = new javax.swing.JTextField();
        CBSexo = new javax.swing.JComboBox<>();
        TFClave = new javax.swing.JTextField();
        CBDia = new javax.swing.JComboBox<>();
        CBMes = new javax.swing.JComboBox<>();
        CBYear = new javax.swing.JComboBox<>();
        GuardarMedico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAResultados = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Documento");

        jLabel2.setText("Nombre");

        jLabel3.setText("Sexo");

        jLabel4.setText("Fecha de nacimiento");

        jLabel5.setText("Clave default");

        TFDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDocumentoActionPerformed(evt);
            }
        });

        TFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNombreActionPerformed(evt);
            }
        });

        CBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        CBSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSexoActionPerformed(evt);
            }
        });

        TFClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFClaveActionPerformed(evt);
            }
        });

        CBDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        CBMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        CBMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMesActionPerformed(evt);
            }
        });

        CBYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));

        GuardarMedico.setBackground(new java.awt.Color(255, 255, 255));
        GuardarMedico.setText("Guardar");
        GuardarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarMedicoActionPerformed(evt);
            }
        });

        TAResultados.setEditable(false);
        TAResultados.setColumns(20);
        TAResultados.setRows(5);
        jScrollPane1.setViewportView(TAResultados);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Inscribir nuevo Médico");

        jComboBox1.setBackground(new java.awt.Color(0, 153, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Alergología", "Anestesiología", "Cardiología", "Gastroenterología", "Endocrinología", "Epidemiología", "Geriatría", "Hepatología", "Hematología", "Infectología", "Medicina familiar y comunitaria", "Medicina física y rehabilitación", "Medicina intensiva", "Medicina interna", "Medicina preventiva y salud pública", "Nefrología", "Neumología", "Neurología", "Nutriología", "Oncología", "Pediatría", "Psiquiatría", "Reumatología", "Toxicología" }));

        jLabel7.setText("Especialidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(62, 62, 62))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(72, 72, 72)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFClave, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBYear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBMes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBDia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GuardarMedico))))))
                .addGap(35, 298, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(GuardarMedico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TFDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDocumentoActionPerformed

    private void TFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNombreActionPerformed

    private void CBSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBSexoActionPerformed

    private void TFClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFClaveActionPerformed

    private void CBMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBMesActionPerformed

    private void GuardarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarMedicoActionPerformed
        // TODO add your handling code here:
        
       
        
        
        /*
        SI HAY UN ERROR POR TIPO DE DATO COMO PONER LETRAS EN LA CEDULA SE MUESTRA MENSAJE DE ERROR.
        SI HAY CAMPOS VACIOS SE DETECTA CON UN IF Y SE PIDE AL ADMIN LLENAR LA INFORMACION FALTANRE.
        
        */
    try{
        documento = Integer.valueOf(TFDocumento.getText());
        nombre = TFNombre.getText();
        sexo = CBSexo.getSelectedItem().toString();
        especialidad = CBSexo.getSelectedItem().toString();
        clave = TFClave.getText();
        GregorianCalendar nacimiento = crear_horario(Integer.valueOf(CBYear.getSelectedItem().toString()),
                                        Integer.valueOf(switch_mes(CBMes.getSelectedItem().toString())),
                                        Integer.valueOf(CBDia.getSelectedItem().toString()),0,0);
    
    
        
        if( nombre != null && !nombre.equals("")    &&    clave != null && !clave.equals("") && !fecha_futura(nacimiento)){
            
            //add del paciente a la lista
            //Sistema system = new Sistema();
            Medico medico_nuevo = new Medico(documento,nombre,clave, sexo, nacimiento,especialidad);
            
            Sistema.agregarMedico( medico_nuevo,Vista.VentanaHome.Sistema_principal);
            
            //Confirmacion visual
            TAResultados.setText("Nuevo usuario agregado\n" +
                                    "ID   " + documento + "\n"+
                                    "Nombre   " + nombre + "\n"+
                                    "Sexo   " + sexo + "\n"+
                                    "clave default   " + clave+ "\n"
                                    + "Fecha de nacimiento  " + imprimir_horario(nacimiento) 
                                    + "\n"+
                                      "Especialidad  " + especialidad
                                    + "\n" );
        }else{
            TAResultados.setText("Error\nPor llene todos los campos");
            if(fecha_futura(nacimiento)){TAResultados.setText("Error\nFecha incorrecta");}
        }
    
    }catch(Exception e){
          TAResultados.setText("Error\nPor favor verifique los datos ingresados");
    }
    
    
    }//GEN-LAST:event_GuardarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBDia;
    private javax.swing.JComboBox<String> CBMes;
    private javax.swing.JComboBox<String> CBSexo;
    private javax.swing.JComboBox<String> CBYear;
    private javax.swing.JButton GuardarMedico;
    private javax.swing.JTextArea TAResultados;
    private javax.swing.JTextField TFClave;
    private javax.swing.JTextField TFDocumento;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables








    //year, month,dayOfMonth,hourOfDay, minute)
    public static GregorianCalendar crear_horario(int year,int month_1_12,int dayOfMonth,int hourOfDay24h,int minute){
        
        GregorianCalendar horario = new GregorianCalendar(year, month_1_12 - 1,dayOfMonth,hourOfDay24h, minute);
        return horario;
    }
    
    //Mes en la clase calendar va de 0 a 11,resulta mas intuitivo usar 1 a 12,a esto se deben los +1 y -1
    
    
    
    public boolean fecha_futura(Calendar fecha){
        
        boolean r = false;
        
        if(fecha_actual.get(Calendar.YEAR)<fecha.get(Calendar.YEAR) ||
           ( fecha_actual.get(Calendar.YEAR) == fecha.get(Calendar.YEAR) && fecha_actual.get(Calendar.MONTH)< fecha.get(Calendar.MONTH) ) ||
                
           (    ( fecha_actual.get(Calendar.YEAR) == fecha.get(Calendar.YEAR) && fecha_actual.get(Calendar.MONTH)== fecha.get(Calendar.MONTH) ) &&
           fecha_actual.get(Calendar.DAY_OF_MONTH)<fecha.get(Calendar.DAY_OF_MONTH))   ){
            
            r = true;
        }
        
        return r;
    }
    
    public String imprimir_horario(GregorianCalendar horario){
        int year = horario.get(Calendar.YEAR);
        int mes = horario.get(Calendar.MONTH) + 1 ; 
        int dia = horario.get(Calendar.DAY_OF_MONTH); 
        int hora = horario.get(Calendar.HOUR_OF_DAY);
        int minuto = horario.get(Calendar.MINUTE);
        
        return  "[ " + year + " / " + mes + " / " + dia 
                //+ " / " + hora + " : " + minuto 
                + " ]" ;
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




}
