/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjpanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author kazuo
 */
public class PanelVisualizacionLaberinto extends JPanel {

    ArrayList<ArrayList<Character>> MapaLaberinto;// ArrayList BiDimensional
    
    int separacionAncho = 1; // ancho
    int separacionAlto = 1;
    int altoPanel = 5;
    int anchoPanel = 10;

    // esta clase solo es un ejemplo para rellenar
    private void rellenarDummy() {
        int ancho = 20; // ancho de la matrid de puntos // solo se usa para el dummy
    int alto = 15; // alto de la matrid de puntos // solo se usa para el dummy
        MapaLaberinto = new ArrayList<ArrayList<Character>>();
        for (int i = 0; i < alto; i++) {
            MapaLaberinto.add(i, new ArrayList<Character>());
            for (int j = 0; j < ancho; j++) {
                if (j % 2 == 0) {

                    MapaLaberinto.get(i).add(j, 'r');
                } else {
                    MapaLaberinto.get(i).add(j, 'w');
                }
            }

        }

    }

    public PanelVisualizacionLaberinto(ArrayList<ArrayList<Character>> MapaLaberinto) {

        if (MapaLaberinto != null) {
            this.MapaLaberinto = MapaLaberinto;
        } else {
            rellenarDummy();
        }
    CrearPanel();
    }
    
    
    

    private void CrearPanel() {
        // establezco el layout a GridLayout, (alto,ancho,separacion alto,separacion ancho)
        this.setLayout(new GridLayout(this.MapaLaberinto.size(), this.MapaLaberinto.get(0).size(), separacionAlto, separacionAncho));
// recorro las fila i
        for (int i = 0; i < MapaLaberinto.size(); i++) {
// recorro la columnas de la fila i
            for (int j = 0; j < MapaLaberinto.get(0).size(); j++) {
                
                // creo un panel nuevo
                JPanel dummyJPanel = new JPanel();
                // cambio el color del panel dependiendo del codigo en el arrayList
                switch (MapaLaberinto.get(i).get(j)) {
                    case 'r':
                        dummyJPanel.setBackground(Color.red);
                        break;
                    case 'b':
                        dummyJPanel.setBackground(Color.blue);
                        break;
                    case 'w':
                        dummyJPanel.setBackground(Color.white);
                        break;
                }
                //establezco el tamaño del panel
                this.setSize(anchoPanel, altoPanel);
                // agrego el panel al panel
                this.add(dummyJPanel,i,j);
            }

        }

    }

}
