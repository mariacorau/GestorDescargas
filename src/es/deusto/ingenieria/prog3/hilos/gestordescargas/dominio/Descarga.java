package es.deusto.ingenieria.prog3.hilos.gestordescargas.dominio;

import javax.swing.JProgressBar;

/**
 * Tarea que simula la descarga de un archivo por bloques
 * y muestra su progreso en una barra de la interfaz.
 *
 * Cada objeto Descarga será ejecutado por su propio hilo.
 */
public class Descarga implements Runnable {

    /** Tiempo que tarda en descargarse cada bloque (milisegundos). */
    private static final int MS_POR_BLOQUE = 200;

    private final String archivo;        // nombre del archivo, por ejemplo "foto.jpg"
    private final int bloques;           // número de bloques que tiene el archivo
    private final JProgressBar barra;    // barra de la ventana donde se muestra el progreso

    public Descarga(String archivo, int bloques, JProgressBar barra) {
        this.archivo = archivo;
        this.bloques = bloques;
        this.barra = barra;
    }

    /**
     * Código que ejecutará el hilo de la descarga.
     */
    @Override
    public void run() {

        // TODO 1: Recorre los bloques del archivo, desde 1 hasta "bloques".

            // TODO 2: Simula la descarga de cada bloque durmiendo el hilo MS_POR_BLOQUE milisegundos.
            //         Trata correctamente la InterruptedException: si interrumpen al hilo,
            //         restaura la marca de interrupción y termina la descarga.

            // TODO 3: Calcula el porcentaje descargado (bloque actual * 100 / total de bloques).

            // TODO 4: Actualiza la barra de progreso con el porcentaje (setValue) y un texto
            //         del tipo "foto.jpg  40 %" (setString).
            //         ¡Cuidado! Este código lo ejecuta el hilo de la descarga, no el hilo de
            //         eventos de Swing. ¿Cómo debes actualizar la barra?

    }
}
