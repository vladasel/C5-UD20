package UD20.tarea9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Action implements ActionListener {

	JToggleButton primerBoton;
	int contador = 0;
	Juego_de_memoria juego;

	public void actionPerformed(ActionEvent clickBoton) {
		// comparar colores --> si son iguales, desactivar botones
		// --> si son diferentes, volver a situacion inicial

		// objeto tipo toggleButon, se utiliza para sacar el botón que ha lanzado el
		// action
		JToggleButton boton = (JToggleButton) clickBoton.getSource();// funciona bien solo si todos los botones son
		// del mismo tipo, en caso de mas tipos de botones, se crearían mas actions

		if (primerBoton == null) {// si no hay ningún boton "clicado"
			primerBoton = boton;// el boton que clicamos, lo consideramos como primer boton
		} else {
			// comprobar primero que no sea el mismo boton para que no se anule a si mismo
			if (boton != primerBoton) {
				// comprobar colores
				if (primerBoton.getBackground().equals(boton.getBackground())) {
					primerBoton.setVisible(false);
					boton.setVisible(false);
				} else {
					primerBoton.setSelected(true);
					boton.setSelected(true);
					contador++;// contamos los intentos fallidos
					juego.getTextField().setText(String.valueOf(contador));

				}
				primerBoton = null;
			} else {
				primerBoton = null;
			}
		}
	}

	public int getContador() {
		return contador;
	}

	public Action(Juego_de_memoria juego) {
		primerBoton = null;
		this.juego = juego;
	}

}