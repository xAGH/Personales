package vistas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Registro extends JDialog {

	private final JPanel ventanaRegistro = new JPanel();
	private JLabel lblTitulo;
	private JTextField textNombreEmpresa;
	private JTextField textDocumentoPaciente;
	private JTextField textNombrePaciente;
	private JTextField textDireccionPaciente;
	private JTextField textTelefonoPaciente;
	private JPanel panelContenido;
	private JLabel lblNombreEmpresa;
	private JLabel lblDocumentoPaciente;
	private JLabel lblNombrePaciente;
	private JLabel lblDireccionPaciente;
	private JLabel lblTelefonoPaciente;
	private JLabel lblTipo;
	private JRadioButton rdbtnTipoMinero;
	private JRadioButton rdbtnTipoOperario;
	private JLabel lblTratamiento;
	private ButtonGroup group;
	private JComboBox<String> comboBox;
	private JLabel lblDiasHospitalizado;
	private JTextField textDiasHospitalizado;
	private JTextField textValorMedicamentos;
	private JLabel lblValorMedicamentos;
	private JPanel panelBotonCalcular;
	private JButton btnCalcular;

	public static void main(String[] args) {
		Registro dialog = new Registro();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	}

	public Registro() {
		setSize(650, 400);
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
		FlowLayout flowLayout = (FlowLayout) panelContenido.getLayout();
		flowLayout.setHgap(45);
		ventanaRegistro.add(panelContenido, BorderLayout.CENTER);
		
		lblNombreEmpresa = new JLabel("Nombre de la empresa");
		lblNombreEmpresa.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblNombreEmpresa);
		
		textNombreEmpresa = new JTextField();
		textNombreEmpresa.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(textNombreEmpresa);
		textNombreEmpresa.setColumns(10);
		
		lblDocumentoPaciente = new JLabel("Documento del paciente");
		lblDocumentoPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblDocumentoPaciente);
		
		textDocumentoPaciente = new JTextField();
		textDocumentoPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textDocumentoPaciente.setColumns(10);
		panelContenido.add(textDocumentoPaciente);
		
		lblNombrePaciente = new JLabel("Nombre del paciente");
		lblNombrePaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblNombrePaciente);
		
		textNombrePaciente = new JTextField();
		textNombrePaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textNombrePaciente.setColumns(10);
		panelContenido.add(textNombrePaciente);
		
		lblDireccionPaciente = new JLabel("Direcci\u00F3n del paciente");
		lblDireccionPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblDireccionPaciente);
		
		textDireccionPaciente = new JTextField();
		textDireccionPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textDireccionPaciente.setColumns(10);
		panelContenido.add(textDireccionPaciente);
		
		lblTelefonoPaciente = new JLabel("Tel\u00E9fono del paciente");
		lblTelefonoPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblTelefonoPaciente);
		
		textTelefonoPaciente = new JTextField();
		textTelefonoPaciente.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textTelefonoPaciente.setColumns(10);
		panelContenido.add(textTelefonoPaciente);
		
		lblTipo = new JLabel("Tipo de paciente");
		lblTipo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblTipo);
		
		rdbtnTipoMinero = new JRadioButton("Minero");
		rdbtnTipoMinero.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		rdbtnTipoMinero.setFocusPainted(false);
		panelContenido.add(rdbtnTipoMinero);
		
		rdbtnTipoOperario = new JRadioButton("Operario");
		rdbtnTipoOperario.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		rdbtnTipoOperario.setFocusPainted(false);
		panelContenido.add(rdbtnTipoOperario);
		
		group = new ButtonGroup();
		group.add(rdbtnTipoMinero);
		group.add(rdbtnTipoOperario);
		
		lblTratamiento = new JLabel("Tratamiento");
		lblTratamiento.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblTratamiento);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
				"-",
				"Neumoconiosis",
				"Vértigo",
				"Problemas respiratorios", 
		}));
		comboBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(comboBox);
		
		lblDiasHospitalizado = new JLabel("Dias hospitalizado");
		lblDiasHospitalizado.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblDiasHospitalizado);
		
		textDiasHospitalizado = new JTextField();
		textDiasHospitalizado.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textDiasHospitalizado.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textDiasHospitalizado.setColumns(10);
		panelContenido.add(textDiasHospitalizado);
		
		lblValorMedicamentos = new JLabel("Valor de medicamentos");
		lblValorMedicamentos.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		panelContenido.add(lblValorMedicamentos);
		
		textValorMedicamentos = new JTextField();
		textValorMedicamentos.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		textValorMedicamentos.setColumns(10);
		panelContenido.add(textValorMedicamentos);
		
		panelBotonCalcular = new JPanel();
		ventanaRegistro.add(panelBotonCalcular, BorderLayout.SOUTH);
		
		btnCalcular = new JButton("Consultar");
		btnCalcular.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		btnCalcular.setFocusPainted(false);
		btnCalcular.setBorder(new EmptyBorder(10,10,10,10));
		btnCalcular.setBackground(new Color(54, 211, 217));
		panelBotonCalcular.add(btnCalcular);
	}

}
