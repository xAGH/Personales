import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.ComponentOrientation;

@SuppressWarnings("serial")
public class Ejercicio3 extends JFrame implements KeyListener, ActionListener {

	private JPanel ventanaPrincipal;
	private JLabel lblTitulo;
	private JPanel contenido;
	private JPanel panelBtnVaciar;
	private JButton btnVaciar;
	private JScrollPane scrollTxt;
	private JScrollPane scrollEti;
	private JLabel etiTexto;
	private JTextField txtTexto;
	
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(650, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		ventanaPrincipal = new JPanel();
		setContentPane(ventanaPrincipal);
		getContentPane().setLayout(new BorderLayout(0, 0));
		addWindowListener(new Ventana());
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		ventanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaPrincipal.setLayout(new BorderLayout(0, 0));
		lblTitulo = new JLabel("Ejercicio 3");
		
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		ventanaPrincipal.add(lblTitulo, BorderLayout.NORTH);
		
		contenido = new JPanel();
		ventanaPrincipal.add(contenido, BorderLayout.CENTER);
		
		scrollTxt = new JScrollPane();
		scrollTxt.setFocusTraversalPolicyProvider(true);
		scrollTxt.setFocusTraversalKeysEnabled(false);
		scrollTxt.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollEti = new JScrollPane();
		scrollEti.setFocusTraversalPolicyProvider(true);
		scrollEti.setFocusTraversalKeysEnabled(false);
		contenido.setLayout(new GridLayout(2, 1, 0, 0));
		contenido.add(scrollEti);
		contenido.add(scrollTxt);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollEti.setViewportView(etiTexto);
		
		txtTexto = new JTextField();
		txtTexto.addKeyListener(this);
		txtTexto.setHorizontalAlignment(SwingConstants.LEFT);
		txtTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollTxt.setViewportView(txtTexto);
		
		panelBtnVaciar = new JPanel();
		ventanaPrincipal.add(panelBtnVaciar, BorderLayout.SOUTH);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(this);
		btnVaciar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelBtnVaciar.add(btnVaciar);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		etiTexto.setText(((JTextField) e.getSource()).getText());
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		etiTexto.setText("");
		txtTexto.setText("");
	}


}
