/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Jorge
 */
public class ControlSesion {
    
    private int minutes;
    private final Timer timer;
    private static ControlSesion controlSesion = null;
    
    private ControlSesion(){
        this.minutes = 0;
        this.timer = new Timer(60000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minutes++;
                if(minutes == 20){
                    JOptionPane.showMessageDialog(null, "Inactivo durante 20 minutos");
                }
            }
        });
    }
    
    public static ControlSesion getControlSesion(){
        if(controlSesion == null){
            controlSesion = new ControlSesion();
        }
        return controlSesion;
    }
    
    public void start(){
        this.timer.start();
    }
    
    public void restart(){
        this.minutes = 0;
        stop();
        start();
    }
    
    public void stop(){
        this.timer.stop();
    }
    
}
