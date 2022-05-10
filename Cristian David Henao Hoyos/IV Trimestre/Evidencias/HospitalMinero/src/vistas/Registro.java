package vistas;

import controladores.Coordinador;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Registro extends JDialog implements ActionListener{

	private final JPanel ventanaRegistro = new JPanel();
	private JLabel lblTitulo;
	private JPanel panelContenido;
	private JButton btnCalcular;
	private JPanel panelIzq;
	private JPanel panelDer;
	private JLabel lblNombreEmpresa;
	private JTextField textNombreEmpresa;
	private JLabel lblDocumentoPaciente;
	private JTextField textDocumento;
	private JLabel lblNombrePaciente;
	private JTextField textNombre;
	private JLabel lblDireccionPaciente;
	private JTextField textDireccion;
	private JLabel lblTelefonoPaciente;
	private JTextField textTelefono;
	private JLabel lblTipo;
	private JRadioButton rdbtnTipoMinero;
	private JRadioButton rdbtnTipoOperario;
	private JLabel lblTratamiento;
	private JComboBox<String> comboBoxTratamiento;
	private JLabel lblDiasHospitalizado;
	private JTextField textDiasHospitalizado;
	private JLabel lblValorMedicamentos;
	private JTextField textValorMedicamentos;
	private JScrollPane scrollPane;
	private Coordinador coordinador;
	private JTextArea textAreaCostos;
	private ButtonGroup grupo;

	public Registro(Coordinador cor) {
		coordinador = cor;
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setSize(650, 500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(ventanaRegistro, BorderLayout.CENTER);
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		ventanaRegistro.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaRegistro.setLayout(new BorderLayout(90, 0));
		
		lblTitulo = new JLabel(" Registro de paciente");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic UI", Font.BOLD, 35));
		lblTitulo.setBorder(new EmptyBorder(20,10,20,10));
		ventanaRegistro.add(lblTitulo, BorderLayout.NORTH);
		
		panelContenido = new JPanel();
		ventanaRegistro.add(panelContenido, BorderLayout.CENTER);
		panelContenido.setLayout(new GridLayout(0, 2, 0, 0));
		
		panelIzq = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelIzq.getLayout();
		flowLayout.setVgap(10);
		flowLayout.setHgap(40);
		panelContenido.add(panelIzq);
		
		lblNombreEmpresa = new JLabel("Nombre de la empresa");
		lblNombreEmpresa.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelIzq.add(lblNombreEmpresa);
		
		textNombreEmpresa = new JTextField();
		textNombreEmpresa.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textNombreEmpresa.setColumns(10);
		panelIzq.add(textNombreEmpresa);
		
		lblDocumentoPaciente = new JLabel("Documento del paciente");
		lblDocumentoPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelIzq.add(lblDocumentoPaciente);
		
		textDocumento = new JTextField();
		textDocumento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textDocumento.setColumns(10);
		panelIzq.add(textDocumento);
		
		lblNombrePaciente = new JLabel("Nombre del paciente");
		lblNombrePaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelIzq.add(lblNombrePaciente);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textNombre.setColumns(10);
		panelIzq.add(textNombre);
		
		lblDireccionPaciente = new JLabel("Direcci\u00F3n del paciente");
		lblDireccionPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelIzq.add(lblDireccionPaciente);
		
		textDireccion = new JTextField();
		textDireccion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textDireccion.setColumns(10);
		panelIzq.add(textDireccion);
		
		lblTelefonoPaciente = new JLabel("Tel\u00E9fono del paciente");
		lblTelefonoPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelIzq.add(lblTelefonoPaciente);
		
		textTelefono = new JTextField();
		textTelefono.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textTelefono.setColumns(10);
		panelIzq.add(textTelefono);
		
		panelDer = new JPanel();
		panelContenido.add(panelDer);
		panelDer.setLayout(null);
		
		lblTipo = new JLabel("Tipo de paciente");
		lblTipo.setBounds(99, 5, 113, 22);
		lblTipo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelDer.add(lblTipo);
		
		rdbtnTipoMinero = new JRadioButton("Minero");
		rdbtnTipoMinero.setBounds(118, 32, 75, 30);
		rdbtnTipoMinero.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		rdbtnTipoMinero.setFocusPainted(false);
		panelDer.add(rdbtnTipoMinero);
		
		rdbtnTipoOperario = new JRadioButton("Operario");
		rdbtnTipoOperario.setBounds(112, 67, 87, 30);
		rdbtnTipoOperario.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		rdbtnTipoOperario.setFocusPainted(false);
		panelDer.add(rdbtnTipoOperario);

		grupo  = new ButtonGroup();
		grupo.add(rdbtnTipoMinero);
		grupo.add(rdbtnTipoOperario);

		lblTratamiento = new JLabel("Tratamiento");
		lblTratamiento.setBounds(114, 102, 84, 22);
		lblTratamiento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelDer.add(lblTratamiento);
		
		comboBoxTratamiento = new JComboBox<String>();
		comboBoxTratamiento.setBounds(56, 129, 200, 28);
		comboBoxTratamiento.setModel(new DefaultComboBoxModel<String>(new String[] {"-- Seleccionar --", "Neumoconiosis", "V\u00E9rtigo", "Problemas respiratorios"}));
		comboBoxTratamiento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelDer.add(comboBoxTratamiento);
		
		lblDiasHospitalizado = new JLabel("Dias hospitalizado");
		lblDiasHospitalizado.setBounds(93, 162, 126, 22);
		lblDiasHospitalizado.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelDer.add(lblDiasHospitalizado);
		
		textDiasHospitalizado = new JTextField();
		textDiasHospitalizado.setBounds(83, 189, 146, 28);
		textDiasHospitalizado.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textDiasHospitalizado.setColumns(10);
		panelDer.add(textDiasHospitalizado);
		
		lblValorMedicamentos = new JLabel("Valor de medicamentos");
		lblValorMedicamentos.setBounds(74, 222, 164, 22);
		lblValorMedicamentos.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelDer.add(lblValorMedicamentos);
		
		textValorMedicamentos = new JTextField();
		textValorMedicamentos.setBounds(83, 249, 146, 28);
		textValorMedicamentos.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textValorMedicamentos.setColumns(10);
		panelDer.add(textValorMedicamentos);
		
		btnCalcular = new JButton("Consultar");
		btnCalcular.setBounds(10, 312, 85, 41);
		btnCalcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelDer.add(btnCalcular);
		btnCalcular.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btnCalcular.setFocusPainted(false);
		btnCalcular.setBorder(new EmptyBorder(10,10,10,10));
		btnCalcular.setBackground(new Color(54, 211, 217));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(118, 288, 184, 65);
		panelDer.add(scrollPane);
		
		textAreaCostos = new JTextArea();
		textAreaCostos.setWrapStyleWord(true);
		scrollPane.setViewportView(textAreaCostos);

		btnCalcular.addActionListener(this);
	
	}

	public char obtenerTipo() {
		if(rdbtnTipoOperario.isSelected()) {
			return 'O';
		} else if(rdbtnTipoMinero.isSelected()) {
			return 'M';
		}
		return '-';
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		coordinador.createTrabajador(
					textNombreEmpresa.getText(),
					textDocumento.getText(), 
					textNombre.getText(), 
					textDireccion.getText(), 
					textTelefono.getText(),
					obtenerTipo(),
					String.valueOf(comboBoxTratamiento.getSelectedItem()),
					Integer.parseInt(textDiasHospitalizado.getText()),
					Double.parseDouble(textValorMedicamentos.getText())
					);

		textAreaCostos.setText("Costos totales: " + coordinador.calcularCostos());
	}

}
