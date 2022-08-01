package UD20.tarea4;

import java.awt.EventQueue;

/**
 * intenta escribit una aplicación gráfica con una ventana que tenga una
 * etiqueta y un área de texto. La aplicación debe reflejar en el área de texto
 * todos los eventos de ventana que se produzcan por la creación de la ventana o
 * por las interacciones del usuario.
 *
 */
public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pruebas_tarea4 frame = new Pruebas_tarea4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
