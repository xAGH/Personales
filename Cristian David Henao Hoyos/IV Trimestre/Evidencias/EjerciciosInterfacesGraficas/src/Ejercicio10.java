import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio10 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JPanel contenido;
	private JPanel panelInput1;
	private JPanel panelInput2;
	private JPanel panelInput3;
	private JButton btnConcatena;
	private JPanel panelInput4;
	private JLabel etiTexto;

	public Ejercicio10() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(650, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		addWindowListener(new Ventana());
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblTitulo = new JLabel("Ejercicio 10");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		contenido = new JPanel();
		contentPane.add(contenido, BorderLayout.CENTER);
		contenido.setLayout(new GridLayout(4, 0, 0, 0));
		
		panelInput1 = new JPanel();
		contenido.add(panelInput1);
		panelInput1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelInput1.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		panelInput2 = new JPanel();
		contenido.add(panelInput2);
		panelInput2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelInput2.add(txtPalabra2);
		txtPalabra2.setColumns(10);
		
		panelInput3 = new JPanel();
		contenido.add(panelInput3);
		panelInput3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		
		btnConcatena = new JButton("Concatenar");
		btnConcatena.addActionListener(this);
		btnConcatena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelInput3.add(btnConcatena);
		
		panelInput4 = new JPanel();
		contenido.add(panelInput4);
		panelInput4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelInput4.add(etiTexto);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		etiTexto.setText(txtPalabra1.getText() + txtPalabra2.getText());
	}

}
