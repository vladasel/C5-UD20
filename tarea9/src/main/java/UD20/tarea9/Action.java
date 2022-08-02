package UD20.tarea9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Action implements ActionListener {

	JToggleButton primerBoton;

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
				}
				primerBoton = null;
			}else {
				primerBoton = null;
			}
		}
	}

	public Action() {
		primerBoton = null;
	}

}