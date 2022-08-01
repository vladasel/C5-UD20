package ud20.tarea3;

import java.awt.EventQueue;

/**
 * intenta escribir una aplicación grafica con una ventana que tenga dos
 * etiquetas y dos botones de operacion. el comportamiento de la aplicacion deve
 * reflejar en el texto de las etiquetas el numero de veces que el usuario ha
 * hecho clic en cada uno de los botones
 *
 */
public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuenta_click frame = new Cuenta_click();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
