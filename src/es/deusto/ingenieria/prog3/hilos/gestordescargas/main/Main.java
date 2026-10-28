package es.deusto.ingenieria.prog3.hilos.gestordescargas.main;

import javax.swing.SwingUtilities;

import es.deusto.ingenieria.prog3.hilos.gestordescargas.gui.VentanaDescargas;

/**
 * Punto de entrada de la aplicación. No hay que modificar esta clase.
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaDescargas().setVisible(true));
    }
}
