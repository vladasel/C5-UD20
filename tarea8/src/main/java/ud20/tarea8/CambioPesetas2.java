package ud20.tarea8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CambioPesetas2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;
	private JTextField txtResultado;
	private boolean cambioAPtas;
	
	private static final double CAMBIO_EURO_PTAS = 166.386;
	private static final double CAMBIO_PTAS_EURO = 0.00601;


	/**
	 * Create the frame.
	 */
	public CambioPesetas2() {
		cambioAPtas = true;
		
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidad = new JLabel("Cantidad a convertir");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCantidad.setBounds(37, 10, 119, 26);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(161, 15, 96, 19);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblResultado.setBounds(267, 10, 62, 26);
		contentPane.add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(330, 15, 96, 19);
		contentPane.add(txtResultado);
		
		final JButton btnEurPta = new JButton("Euros a ptas");
		btnEurPta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cambioAPtas) {
					cambioAPtas = false;
					btnEurPta.setText("Ptas a euros");
				} else {
					cambioAPtas = true;
					btnEurPta.setText("Euros a ptas");
				}
			}
		});
		btnEurPta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEurPta.setBounds(75, 46, 105, 26);
		contentPane.add(btnEurPta);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( entradaCorrecta(txtCantidad.getText()) ) {
					double resultado;
					if(cambioAPtas) {
						resultado = Double.parseDouble(txtCantidad.getText())*CAMBIO_EURO_PTAS;
					} else {
						resultado = Double.parseDouble(txtCantidad.getText())*CAMBIO_PTAS_EURO;
					}
					//Dejar solo 3 decimales
					txtResultado.setText(String.format("%.3f", resultado));;
					
				} else {
					JOptionPane.showMessageDialog(CambioPesetas2.this, "Error: Introducir solo caracteres validos.");
					return;
				}
				
			}
		});
		btnCambiar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCambiar.setBounds(190, 46, 105, 26);
		contentPane.add(btnCambiar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCantidad.setText("");
				txtResultado.setText("");
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBorrar.setBounds(305, 46, 86, 26);
		contentPane.add(btnBorrar);
	}
	
	private boolean entradaCorrecta (String texto) {
		if(texto.equals("")) {
			return false;
		} 
		String charsAceptados = "1234567890.";
		int numPuntos = 0;
		
		for ( char letra : texto.toCharArray() ) {
			if ( !charsAceptados.contains(Character.toString(letra)) ) {
				return false;
			}
			if (letra == '.') {
				numPuntos++;
			}
			if (numPuntos > 1) {
				return false;
			}
		}
		
		return true;
		
	}	
	
}
