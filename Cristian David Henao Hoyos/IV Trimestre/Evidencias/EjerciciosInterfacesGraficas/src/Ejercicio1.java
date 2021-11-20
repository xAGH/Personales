import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Ejercicio1 extends JFrame implements ActionListener{

	private JPanel ventanaPrincipal;
	private JLabel etiNombre;
	private JLabel etiCiudad;
	private JButton btnOcultarNombre;
	private JButton btnOcultarCiudad;
	private JButton btnVisuNombre;
	private JButton btnVisuCiudad;
	private JLabel titulo;
	private JPanel panelElementos;
	private JPanel panelBtn1;
	private JPanel panelBtn2;
	private JPanel panelBtn3;
	private JPanel panelBtn4;

	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(650, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		ventanaPrincipal = new JPanel();
		setContentPane(ventanaPrincipal);
		addWindowListener(new Ventana());
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		ventanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaPrincipal.setLayout(new BorderLayout(1, 0));
		
		titulo = new JLabel("Ejercicio 1");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Verdana", Font.BOLD, 50));
		ventanaPrincipal.add(titulo, BorderLayout.NORTH);
		
		panelElementos = new JPanel();
		ventanaPrincipal.add(panelElementos, BorderLayout.CENTER);
		panelElementos.setLayout(new GridLayout(3, 2, 100, 50));
		
		etiNombre = new JLabel("Alejo");
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panelElementos.add(etiNombre);
		
		etiCiudad = new JLabel("Armenia");
		etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 25));
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		panelElementos.add(etiCiudad);
		
		panelBtn1 = new JPanel();
		panelElementos.add(panelBtn1);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.addActionListener(this);
		panelBtn1.add(btnOcultarNombre);
		btnOcultarNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOcultarNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panelBtn2 = new JPanel();
		panelElementos.add(panelBtn2);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.addActionListener(this);
		panelBtn2.add(btnOcultarCiudad);
		btnOcultarCiudad.setHorizontalTextPosition(SwingConstants.CENTER);
		btnOcultarCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panelBtn3 = new JPanel();
		panelElementos.add(panelBtn3);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setEnabled(false);
		btnVisuNombre.addActionListener(this);
		panelBtn3.add(btnVisuNombre);
		btnVisuNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisuNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panelBtn4 = new JPanel();
		panelElementos.add(panelBtn4);
		
		btnVisuCiudad = new JButton("Viusalizar Ciudad");
		btnVisuCiudad.setEnabled(false);
		btnVisuCiudad.addActionListener(this);
		panelBtn4.add(btnVisuCiudad);
		btnVisuCiudad.setHorizontalTextPosition(SwingConstants.CENTER);
		btnVisuCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOcultarNombre) {
			btnOcultarNombre.setEnabled(false);
			btnVisuNombre.setEnabled(true);	
			etiNombre.setVisible(false);
		} else if (e.getSource() == btnOcultarCiudad) {
			btnOcultarCiudad.setEnabled(false);
			btnVisuCiudad.setEnabled(true);
			etiCiudad.setVisible(false);
		} else if (e.getSource() == btnVisuCiudad) {
			btnVisuCiudad.setEnabled(false);
			btnOcultarCiudad.setEnabled(true);
			etiCiudad.setVisible(true);
		} else if (e.getSource() == btnVisuNombre) {
			btnVisuNombre.setEnabled(false);
			btnOcultarNombre.setEnabled(true);
			etiNombre.setVisible(true);
		}
	}
}