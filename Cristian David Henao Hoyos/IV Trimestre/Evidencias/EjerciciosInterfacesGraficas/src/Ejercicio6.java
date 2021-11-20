import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

public class Ejercicio6 extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JLabel lblTitulo;
	private JButton btnCentro;
	private JButton btnEsquinaDer;
	private JButton btnEsquinaIzq;
	private JPanel panel;
	private JLabel etiNombre;
	private JButton btnAgrandar;
	private JButton btnAchicar;
	private JButton btnEsquinaDerInf;
	private JButton btnEsquinaIzqInf;
	private int tamanio = 0;
	private JButton elemento;
	private JButton[] btns;

	public Ejercicio6() {
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
		lblTitulo = new JLabel("Ejercicio 6");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btnEsquinaIzq = new JButton("Esquina");
		btnEsquinaIzq.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEsquinaIzq.addMouseListener(this);
		btnEsquinaIzq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEsquinaIzq.setBounds(10, 11, 120, 30);
		panel.add(btnEsquinaIzq);
		
		btnEsquinaDer = new JButton("Esquina");
		btnEsquinaDer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnEsquinaDer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEsquinaDer.addMouseListener(this);
		btnEsquinaDer.setBounds(494, 11, 120, 30);
		panel.add(btnEsquinaDer);
		
		btnCentro = new JButton("Centro");
		btnCentro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCentro.addMouseListener(this);
		btnCentro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCentro.setBounds(250, 173, 120, 30);
		btnCentro.setVisible(false);
		panel.add(btnCentro);
		
		etiNombre = new JLabel("Alejo");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setForeground(Color.WHITE);
		etiNombre.setBackground(Color.BLACK);
		etiNombre.setOpaque(true);
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiNombre.setBounds(250, 174, 120, 30);
		etiNombre.setMaximumSize(new Dimension(120, 30));
		panel.add(etiNombre);
		
		btnAgrandar = new JButton("AGRANDAR");
		btnAgrandar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgrandar.addMouseListener(this);
		btnAgrandar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAgrandar.setBounds(44, 173, 147, 30);
		panel.add(btnAgrandar);
		
		btnAchicar = new JButton("achicar");
		btnAchicar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAchicar.addMouseListener(this);
		btnAchicar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAchicar.setBounds(430, 173, 120, 30);
		panel.add(btnAchicar);
		
		btnEsquinaDerInf = new JButton("Esquina");
		btnEsquinaDerInf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEsquinaDerInf.addMouseListener(this);
		btnEsquinaDerInf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEsquinaDerInf.setBounds(494, 348, 120, 30);
		panel.add(btnEsquinaDerInf);
		
		btnEsquinaIzqInf = new JButton("Esquina");
		btnEsquinaIzqInf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEsquinaIzqInf.addMouseListener(this);
		btnEsquinaIzqInf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEsquinaIzqInf.setBounds(10, 348, 120, 30);
		panel.add(btnEsquinaIzqInf);
		
		btns = new JButton[]{
			btnAchicar, 
			btnAgrandar, 
			btnCentro, 
			btnEsquinaDer, 
			btnEsquinaDerInf, 
			btnEsquinaIzq, 
			btnEsquinaIzqInf};
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnAgrandar) {
			if (tamanio <= 7) {
				var bounds = etiNombre.getBounds();
				var font = etiNombre.getFont();
				etiNombre.setBounds(bounds.x, bounds.y, bounds.width + 5, bounds.height + 3);
				etiNombre.setFont(new Font("Tahoma", Font.PLAIN, font.getSize() + 2));
				tamanio += 1;
			}
		} else if (e.getSource() == btnAchicar) {
			if (tamanio >= -4) {
				var bounds = etiNombre.getBounds();
				var font = etiNombre.getFont();
				etiNombre.setBounds(bounds.x, bounds.y, bounds.width - 5, bounds.height - 3);
				etiNombre.setFont(new Font("Tahoma", Font.PLAIN, font.getSize() -2));
				tamanio -= 1;
			}
		} else {
			elemento = (JButton) e.getSource();
			var bounds = elemento.getBounds();
			var size = etiNombre.getSize();
			etiNombre.setBounds(bounds.x, bounds.y, size.width, size.height);
			for(JButton b :  btns) {
				if (b != elemento) {
					b.setVisible(true);
				}
				else{
					b.setVisible(false);
				}
			}
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		elemento = (JButton) e.getSource();
		var size = elemento.getSize();
		elemento.setSize(size.width + 10, size.height + 5);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		elemento = (JButton) e.getSource();
		var size = elemento.getSize();
		elemento.setSize(size.width - 10, size.height - 5);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}

}
