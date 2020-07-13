/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Sistema;
import java.io.*;
/**
 *
 * @author Alejandro Ortiz
 */
public class SerializacionSistema implements java.io.Serializable 
        
        
        
        /*
        ADAPTADO DE  DE https://www.geeksforgeeks.org/serialization-in-java/

        
        */
{ 
    Sistema SistemaAGuardar;
  
    // Default constructor 
    
    public SerializacionSistema() 
    { 
        this.SistemaAGuardar = VentanaHome.Sistema_principal;
    } 
  
    
    

  
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    
    // Java code for serialization and deserialization  
// of a Java object 
 
  

  
 
 public static void guardarSistema(){
     
 
        SerializacionSistema object = new SerializacionSistema(); 
        String filename = "file.ser"; 
          
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // GUARDAR EL SISTEMA
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(object); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
        
        
        
        
        
        
        
                catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
        
        
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 }
        
        
        //--------------------------------------------------------------------
        
 
  public static void CargarSistema(){
      
  
          SerializacionSistema object1 = null; 
          String filename = "file.ser"; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (SerializacionSistema)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            
            //Carga final del objeto al programa
            VentanaHome.Sistema_principal = object1.SistemaAGuardar;
            
        } 
          
        
        
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
            ex.printStackTrace();
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
        
  }
        //--------------------------------------------------------------------
  
    

    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    
}
