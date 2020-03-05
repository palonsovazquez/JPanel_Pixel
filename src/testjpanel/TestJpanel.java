/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjpanel;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kazuo
 */
public class TestJpanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo un jFrame
      JFrame x = new JFrame("test");
     // debes enviar un ArrayList<ArrayList<Character> codificado con las marcas si es nulo crea datos de prueba
     JPanel panelvisualizador =new PanelVisualizacionLaberinto(null); 
     
     x.add(panelvisualizador);
      // el pack sirve para reconfigurar el tamaño del jframe a los elementos que contiene
      x.pack();
      
      // hace visible la ventana
      x.setVisible(true);
      
    }
    
}
