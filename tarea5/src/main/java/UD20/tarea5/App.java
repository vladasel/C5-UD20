package UD20.tarea5;

import java.awt.EventQueue;

/**
 * escribe una aplicación gráfica con una ventana que tenga un botón y un área
 * de text. debe reflejar en el área de texto los princiapales eventos de ratón
 * que se produzcan sobre la dicha área por las interacciones del usuario,
 * haciendo clic en el botón se limpiará el contenido del área de texto
 *
 */
public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mouse_events frame = new Mouse_events();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
