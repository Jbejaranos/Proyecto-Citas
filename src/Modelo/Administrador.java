/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author Jorge
 */
@Entity
@Table(name="administradores")
public class Administrador extends Persona {
    
    public Administrador(long identificacion, String nombre, String password, String genero, Calendar fechaNacimiento) {
        super(identificacion, nombre, password, genero, fechaNacimiento);
    }
    
}
