import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Cursor;

public class Ejercicio5 extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel etiOcultar;
	private JPanel panelOcultar;
	private JLabel etiPal4;
	private JLabel etiPal3;
	private JLabel etiPal2;
	private JLabel etiPal1;
	private JPanel panelPal;
	private JPanel panelContenido;

	public Ejercicio5() {
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
		lblTitulo = new JLabel("Ejercicio 5");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		panelContenido = new JPanel();
		contentPane.add(panelContenido, BorderLayout.CENTER);
		panelContenido.setLayout(new GridLayout(0, 1, 9, 0));
		
		panelPal = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelPal.getLayout();
		flowLayout.setHgap(50);
		flowLayout.setVgap(80);
		panelContenido.add(panelPal);
		
		etiPal1 = new JLabel("Todas");
		etiPal1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelPal.add(etiPal1);
		
		etiPal2 = new JLabel("Estas");
		etiPal2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelPal.add(etiPal2);
		
		etiPal3 = new JLabel("Etiquetas");
		etiPal3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelPal.add(etiPal3);
		
		etiPal4 = new JLabel("Desaparecen");
		etiPal4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelPal.add(etiPal4);
		
		panelOcultar = new JPanel();
		panelContenido.add(panelOcultar);
		panelOcultar.setLayout(null);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setOpaque(true);
		etiOcultar.addMouseListener(this);
		etiOcultar.setHorizontalTextPosition(SwingConstants.CENTER);
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		etiOcultar.setBounds(new Rectangle(246, 73, 144, 50));
		etiOcultar.setBackground(Color.BLACK);
		etiOcultar.setForeground(Color.WHITE);
		etiOcultar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelOcultar.add(etiOcultar);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		etiPal1.setVisible(false);
		etiPal2.setVisible(false);
		etiPal3.setVisible(false);
		etiPal4.setVisible(false);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		etiPal1.setVisible(true);
		etiPal2.setVisible(true);
		etiPal3.setVisible(true);
		etiPal4.setVisible(true);
	}

}
