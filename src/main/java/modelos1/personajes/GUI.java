/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos1.personajes;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author jhosd
 */
public class GUI extends JFrame{
    JFrame marco;
    JButton crear;
    JComboBox seleccion;
    
    GUI(){
        marco=new JFrame("Creación de personajes");
        marco.setVisible(true);
        marco.setSize(800,400);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(null);
        marco.add(seleccion);
        marco.add(crear);
    }
}
