/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.ventana;

import java.awt.Frame;

/**
 *
 * @author user
 */
public class Ventana extends Frame {

    public Ventana(String titulo) {
        this.setTitle(titulo);
        this.setVisible(true);
    }

    public Ventana(String titulo, int ancho, int alto) {
        this.setTitle(titulo);
        this.setSize(ancho, alto);

    }

    public Ventana(int ancho, int alto) {

        this.setSize(ancho, alto);

    }

    public Ventana() {

    }
}
