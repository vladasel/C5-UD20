package ud20.tarea6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class IndiceMasaCorporal extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JTextField txtResultado;

	/**
	 * Create the frame.
	 */
	public IndiceMasaCorporal() {
		setTitle("Indice de Masa Corporal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAltura = new JLabel("Altura (metros)");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltura.setBounds(51, 24, 98, 27);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(159, 29, 96, 19);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso (kg)");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPeso.setBounds(265, 24, 61, 27);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(336, 29, 96, 19);
		contentPane.add(txtPeso);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblImc.setBounds(246, 76, 28, 27);
		contentPane.add(lblImc);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(284, 81, 96, 19);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular IMC");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = "";
				double altura, peso;
				
				altura = Double.parseDouble(txtAltura.getText());
				peso = Double.parseDouble(txtPeso.getText());
				
				resultado = Double.toString(altura * altura / peso);
				txtResultado.setText(resultado);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.setBounds(131, 76, 105, 27);
		contentPane.add(btnCalcular);
	}

}
