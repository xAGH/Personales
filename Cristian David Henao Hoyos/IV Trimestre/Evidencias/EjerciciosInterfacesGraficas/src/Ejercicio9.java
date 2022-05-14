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

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;

import java.awt.Color;

public class Ejercicio9 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JPanel contenido;
	private JPanel panelNotas;
	private JLabel lblPrimerTrimestre;
	private JLabel lblSegundoTrimestre;
	private JLabel lblTercerTrimestre;
	private JPanel panelResultados;
	private JPanel panelBtn;
	private JLabel etiResultado;
	private JLabel etiNotaFinal;
	private JButton btnCalcular;
	
	public Ejercicio9() {
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
		lblTitulo = new JLabel("Ejercicio 9");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		contenido = new JPanel();
		contentPane.add(contenido, BorderLayout.CENTER);
		contenido.setLayout(new GridLayout(3, 0, 0, 0));
		
		panelNotas = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelNotas.getLayout();
		flowLayout.setHgap(70);
		contenido.add(panelNotas);
		
		lblPrimerTrimestre = new JLabel("Nota 1er trimestre: ");
		lblPrimerTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrimerTrimestre.setHorizontalAlignment(SwingConstants.CENTER);
		panelNotas.add(lblPrimerTrimestre);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPrimerTrimestre.setHorizontalAlignment(SwingConstants.LEFT);
		panelNotas.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		lblSegundoTrimestre = new JLabel("Nota 2do trimestre: ");
		lblSegundoTrimestre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelNotas.add(lblSegundoTrimestre);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setHorizontalAlignment(SwingConstants.LEFT);
		txtSegundoTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSegundoTrimestre.setColumns(10);
		panelNotas.add(txtSegundoTrimestre);
		
		lblTercerTrimestre = new JLabel("Nota 3er trimestre: ");
		lblTercerTrimestre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTercerTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelNotas.add(lblTercerTrimestre);
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setHorizontalAlignment(SwingConstants.LEFT);
		txtTercerTrimestre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTercerTrimestre.setColumns(10);
		panelNotas.add(txtTercerTrimestre);
		
		panelBtn = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelBtn.getLayout();
		flowLayout_1.setVgap(50);
		flowLayout_1.setHgap(4);
		contenido.add(panelBtn);
		
		btnCalcular = new JButton("Calcular nota final");
		btnCalcular.addActionListener(this);
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBtn.add(btnCalcular);
		
		panelResultados = new JPanel();
		contenido.add(panelResultados);
		panelResultados.setLayout(new GridLayout(2, 1, 0, 0));
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		etiNotaFinal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelResultados.add(etiNotaFinal);
		
		etiResultado = new JLabel("");
		etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
		etiResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelResultados.add(etiResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			float n1 = Float.parseFloat(txtPrimerTrimestre.getText());
			float n2 = Float.parseFloat(txtSegundoTrimestre.getText());
			float n3 = Float.parseFloat(txtTercerTrimestre.getText());
			float promedio = Math.round((((n1 + n2 + n3) / 3) * 100.0) / 100.0);
			System.out.println(promedio);
			etiNotaFinal.setText(""+ promedio);
			if (promedio < 5) {
				etiResultado.setText("SUSPENSO");
				etiResultado.setForeground(Color.RED);
				etiNotaFinal.setForeground(Color.RED);
			} else {
				etiResultado.setText("APROBADO");
				etiResultado.setForeground(Color.BLACK);
				etiNotaFinal.setForeground(Color.BLACK);
			}
		} catch (Exception exc) {
			etiNotaFinal.setText("ERROR");
			etiResultado.setText("ERROR");
			etiResultado.setForeground(Color.RED);
			etiNotaFinal.setForeground(Color.RED);
		}
	}
}
