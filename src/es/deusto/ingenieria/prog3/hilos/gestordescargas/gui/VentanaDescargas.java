package es.deusto.ingenieria.prog3.hilos.gestordescargas.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import es.deusto.ingenieria.prog3.hilos.gestordescargas.dominio.Descarga;

/**
 * Ventana que lanza varias descargas simultáneas y muestra su progreso.
 *
 * La interfaz ya está construida. Solo tienes que completar el método
 * iniciarDescargas() siguiendo las tareas indicadas.
 */
public class VentanaDescargas extends JFrame {

    private static final long serialVersionUID = 1L;

    // Archivos que se van a descargar y su tamaño en bloques
    private final String[] archivos = { "foto.jpg", "video.mp4", "documento.pdf" };
    private final int[] bloques     = { 5, 15, 8 };

    // Componentes de la ventana
    private final JProgressBar[] barras = new JProgressBar[archivos.length];
    private final JButton btnIniciar = new JButton("Iniciar descargas");
    private final JLabel lblEstado = new JLabel("Pulsa el botón para empezar");

    public VentanaDescargas() {
        setTitle("Gestor de descargas");

        // Centro: una barra de progreso por descarga
        JPanel pnlBarras = new JPanel(new GridLayout(archivos.length, 1, 0, 8));
        pnlBarras.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        for (int i = 0; i < archivos.length; i++) {
            barras[i] = new JProgressBar(0, 100);
            barras[i].setStringPainted(true);
            barras[i].setString(archivos[i] + "  0 %");
            pnlBarras.add(barras[i]);
        }

        // Sur: botón y etiqueta de estado
        JPanel pnlInferior = new JPanel(new FlowLayout());
        pnlInferior.add(btnIniciar);
        pnlInferior.add(lblEstado);

        add(pnlBarras, BorderLayout.CENTER);
        add(pnlInferior, BorderLayout.SOUTH);

        // Al pulsar el botón se llama a iniciarDescargas()
        btnIniciar.addActionListener(e -> iniciarDescargas());

        setSize(450, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * Se ejecuta al pulsar el botón "Iniciar descargas".
     * ¡Ojo! Este método lo ejecuta el hilo de eventos de Swing (EDT):
     * no debe hacer trabajo largo ni quedarse esperando.
     */
    private void iniciarDescargas() {

        // TODO 5: Deshabilita el botón para que no se puedan lanzar las descargas dos veces
        //         y muestra "Descargando..." en la etiqueta de estado.

        // TODO 6: Para cada archivo:
        //         - pon su barra a 0 %,
        //         - crea la tarea Descarga con su nombre, su número de bloques y su barra,
        //         - crea un hilo y entrégale la tarea,
        //         - dale al hilo el nombre "Hilo-" + nombre del archivo,
        //         - y ponlo en marcha.
        //         Guarda los hilos en un array: los necesitarás en la tarea 7.

        // TODO 7: Cuando terminen TODAS las descargas, la etiqueta debe mostrar
        //         "Descargas completadas" y el botón debe volver a estar habilitado.
        //         Pistas:
        //         - Para esperar a que un hilo termine se usa join().
        //         - Si haces join() aquí, ¿qué le pasará a la ventana? Usa otro hilo
        //           (un "coordinador") que haga la espera.
        //         - Cuando el coordinador termine de esperar, ¿quién debe modificar
        //           la etiqueta y el botón?

    }
}
