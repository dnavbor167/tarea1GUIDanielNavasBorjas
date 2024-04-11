/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ejer2;

import daw.ejer1.MiPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class Main {

    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame("Daniel Navas Borjas");
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        //creamos los objetos independientes para luego acceder al objeto
        //y cambiarlet a la etiqueta el texto
        MiPanel p1 = new MiPanel(Color.BLUE);
        MiPanel p2 = new MiPanel(Color.orange);
        MiPanel p3 = new MiPanel(Color.PINK);
        MiPanel p4 = new MiPanel(Color.MAGENTA);
        MiPanel p5 = new MiPanel(Color.GREEN);
        p1.getEtiqueta().setText("Hola");
        p2.getEtiqueta().setText("Me llamo");
        p3.getEtiqueta().setText("Daniel");
        p4.getEtiqueta().setText("Adios");
        p5.getEtiqueta().setText("Ponme un 10");
        ventanaPrincipal.add(p1, BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(p5, BorderLayout.SOUTH);
        // Añadir panel gris en la posición central (CENTER
        
    	ventanaPrincipal.add(p2, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(p3, BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(p4, BorderLayout.EAST);
        
        ventanaPrincipal.setSize(800, 600);
        
        //hacer que la ventana no se redimensionable
        ventanaPrincipal.setResizable(false);
        //para que aparezca en el medio de la pantalla
        ventanaPrincipal.setLocationRelativeTo(null);
        
        //mostramos la pantalla
        ventanaPrincipal.setVisible(true);
        // Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
