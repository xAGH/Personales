package vistas;

import controladores.Coordinador;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class Consulta extends JDialog implements ActionListener{
	private JLabel lblConsultaDePaciente;
	private JPanel panelContenido;
	private JTextField textField;
	private Coordinador coordinador;
	private JLabel lblDocumento;
	private JButton btnBuscar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	public Consulta(Coordinador coordinador) {
		this.coordinador = coordinador;
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(769, 550);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		inciarComponentes();
	}
	
	private void inciarComponentes() {
		lblConsultaDePaciente = new JLabel(" Consulta de paciente");
		lblConsultaDePaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaDePaciente.setFont(new Font("Yu Gothic UI", Font.BOLD, 35));
		lblConsultaDePaciente.setBorder(new EmptyBorder(20,10,20,10));
		getContentPane().add(lblConsultaDePaciente, BorderLayout.NORTH);
		
		panelContenido = new JPanel();
		getContentPane().add(panelContenido, BorderLayout.CENTER);
		panelContenido.setLayout(null);
		
		lblDocumento = new JLabel("Documento:");
		lblDocumento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblDocumento.setBounds(263, 11, 108, 22);
		panelContenido.add(lblDocumento);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(381, 8, 146, 28);
		panelContenido.add(textField);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(542, 11, 108, 22);
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuscar.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btnBuscar.setFocusPainted(false);
		btnBuscar.setBorder(new EmptyBorder(10,10,10,10));
		btnBuscar.setBackground(new Color(54, 211, 217));
		btnBuscar.addActionListener(this);
		panelContenido.add(btnBuscar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 94, 753, 280);
		panelContenido.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		scrollPane.setViewportView(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.setText(coordinador.buscar(textField.getText()));
	}
}
