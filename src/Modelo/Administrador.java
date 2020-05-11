/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Jorge
 */
public class Administrador extends Persona {
    
    public Administrador(long identificacion, String nombre, String password, String genero, Date fechaNacimiento) {
        super(identificacion, nombre, password, genero, fechaNacimiento);
    }
    
}
