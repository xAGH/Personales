import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextPane;
import java.awt.FlowLayout;


@SuppressWarnings("serial")
public class Ejercicio11 extends JFrame implements MouseListener{

	private JPanel ventanaPrincipal;
	private JPanel panelNumeros;
	private JLabel lblTitulo;
	private JLabel etiCero;
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;
	private JButton btnEliminar;
	private JTextPane txtNumeros;
	private JPanel panelEliminar;

	public Ejercicio11() {
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
		ventanaPrincipal.setLayout(new BorderLayout(0, 0));
		
		lblTitulo = new JLabel("Ejercicio 11");
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		ventanaPrincipal.add(lblTitulo, BorderLayout.NORTH);		
		
		panelNumeros = new JPanel();
		ventanaPrincipal.add(panelNumeros, BorderLayout.CENTER);
		
		
		etiCero = new JLabel("0");
		etiCero.setIconTextGap(10);
		etiCero.setHorizontalAlignment(SwingConstants.CENTER);
		etiCero.setFont(new Font("Arial", Font.PLAIN, 24));
		etiCero.addMouseListener(this);
		
		etiUno = new JLabel("1");
		etiUno.setIconTextGap(10);
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setFont(new Font("Arial", Font.PLAIN, 24));
		etiUno.addMouseListener(this);

		etiDos = new JLabel("2");
		etiDos.setIconTextGap(10);
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Arial", Font.PLAIN, 24));
		etiDos.addMouseListener(this);
		
		etiTres = new JLabel("3");
		etiTres.setIconTextGap(10);
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Arial", Font.PLAIN, 24));
		etiTres.addMouseListener(this);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setIconTextGap(10);
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Arial", Font.PLAIN, 24));
		etiCuatro.addMouseListener(this);
		
		etiCinco = new JLabel("5");
		etiCinco.setIconTextGap(10);
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Arial", Font.PLAIN, 24));
		etiCinco.addMouseListener(this);

		etiSeis = new JLabel("6");
		etiSeis.setIconTextGap(10);
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Arial", Font.PLAIN, 24));
		etiSeis.addMouseListener(this);
		
		etiSiete = new JLabel("7");
		etiSiete.setIconTextGap(10);
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Arial", Font.PLAIN, 24));
		etiSiete.addMouseListener(this);

		etiOcho = new JLabel("8");
		etiOcho.setIconTextGap(10);
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Arial", Font.PLAIN, 24));
		etiOcho.addMouseListener(this);
		
		
		etiNueve = new JLabel("9");
		etiNueve.setIconTextGap(10);
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Arial", Font.PLAIN, 24));
		etiNueve.addMouseListener(this);
		panelNumeros.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 165));
		panelNumeros.add(etiCero);
		panelNumeros.add(etiUno);
		panelNumeros.add(etiDos);
		panelNumeros.add(etiTres);
		panelNumeros.add(etiCuatro);
		panelNumeros.add(etiCinco);
		panelNumeros.add(etiSeis);
		panelNumeros.add(etiSiete);
		panelNumeros.add(etiOcho);
		panelNumeros.add(etiNueve);

		
		txtNumeros = new JTextPane();
		txtNumeros.setFont(new Font("Arial", Font.PLAIN, 24));
		txtNumeros.setEditable(false);
		ventanaPrincipal.add(txtNumeros, BorderLayout.SOUTH);
		
		panelEliminar = new JPanel();
		ventanaPrincipal.add(panelEliminar, BorderLayout.EAST);
		panelEliminar.setLayout(new BoxLayout(panelEliminar, BoxLayout.X_AXIS));
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFocusPainted(false);
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEliminar.addMouseListener(this);
		panelEliminar.add(btnEliminar);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnEliminar) {
			txtNumeros.setText("");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		try {
			JLabel elemento = (JLabel) e.getSource();
			txtNumeros.setText(txtNumeros.getText() + elemento.getText());			
		} catch (Exception exc) {}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}


	@Override
	public void mouseExited(MouseEvent e) {}
}
