import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Color;

public class Ejercicio8 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JPanel panel;
	private JPanel panelTexto;
	private JLabel etiTexto;
	private JPanel panelColores;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JPanel panelFondos;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnFondoVerde;
	private JPanel panelOpciones;
	private JButton btnTransparente;
	private JButton btnOpaca;

	public Ejercicio8() {
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
		lblTitulo = new JLabel("Ejercicio 7");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 0, 0, 0));
		
		panelTexto = new JPanel();
		panel.add(panelTexto);
		panelTexto.setLayout(null);
		
		etiTexto = new JLabel("¿Qué debería de poner?");
		etiTexto.setBounds(150, 30, 311, 65);
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panelTexto.add(etiTexto);
		
		panelColores = new JPanel();
		panel.add(panelColores);
		panelColores.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 35));
		
		btnAzul = new JButton("Azul");
		btnAzul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAzul.addActionListener(this);
		btnAzul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelColores.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRojo.addActionListener(this);
		btnRojo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelColores.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVerde.addActionListener(this);
		btnVerde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelColores.add(btnVerde);
		
		panelFondos = new JPanel();
		panel.add(panelFondos);
		panelFondos.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 35));
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setEnabled(false);
		btnFondoAzul.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFondoAzul.addActionListener(this);
		btnFondoAzul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFondos.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setEnabled(false);
		btnFondoRojo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFondoRojo.addActionListener(this);
		btnFondoRojo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFondos.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setEnabled(false);
		btnFondoVerde.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFondoVerde.addActionListener(this);
		btnFondoVerde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelFondos.add(btnFondoVerde);
		
		panelOpciones = new JPanel();
		panel.add(panelOpciones);
		panelOpciones.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 35));
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setEnabled(false);
		btnTransparente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTransparente.addActionListener(this);
		btnTransparente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelOpciones.add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOpaca.addActionListener(this);
		btnOpaca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelOpciones.add(btnOpaca);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAzul) {
			etiTexto.setForeground(Color.BLUE);
		} else if (e.getSource() == btnRojo) {
			etiTexto.setForeground(Color.RED);
		} else if (e.getSource() == btnVerde) {
			etiTexto.setForeground(Color.GREEN);
		} else if (e.getSource() == btnFondoAzul) {
			etiTexto.setBackground(Color.BLUE);
		} else if (e.getSource() == btnFondoVerde) {
			etiTexto.setBackground(Color.GREEN);
		} else if (e.getSource() == btnFondoRojo) {
			etiTexto.setBackground(Color.RED);
		} else if (e.getSource() == btnOpaca) {
			etiTexto.setOpaque(true);
			btnTransparente.setEnabled(true);
			btnOpaca.setEnabled(false);
			btnFondoAzul.setEnabled(true);
			btnFondoVerde.setEnabled(true);
			btnFondoRojo.setEnabled(true);
		} else if (e.getSource() == btnTransparente) {
			etiTexto.setBackground(Color.WHITE);
			etiTexto.setOpaque(false);
			btnTransparente.setEnabled(false);
			btnOpaca.setEnabled(true);
			btnFondoAzul.setEnabled(false);
			btnFondoVerde.setEnabled(false);
			btnFondoRojo.setEnabled(false);
		}
	}

}
