import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JButton;

public class Ejercicio4 extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField txtCiudad;
	private JTextField txtNombre;
	private JLabel lblTitulo;
	private JPanel panelContenido;
	private JPanel panelTxt;
	private JLabel lblNombre;
	private JLabel lblNewLabel_1;
	private JPanel panelLbl;
	private JLabel txtFrase;
	private JPanel panelBtnAceptar;
	private JButton btnAceptar;
	private JPanel panelBtn;
	private JButton btnActivar;
	private JButton btnDesactivar;

	public Ejercicio4() {
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
		lblTitulo = new JLabel("Ejercicio 4");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		panelContenido = new JPanel();
		contentPane.add(panelContenido, BorderLayout.CENTER);
		panelContenido.setLayout(new GridLayout(4, 0, 0, 0));
		
		panelTxt = new JPanel();
		panelContenido.add(panelTxt);
		FlowLayout fl_panelTxt = new FlowLayout(FlowLayout.CENTER, 50, 15);
		panelTxt.setLayout(fl_panelTxt);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setVerticalAlignment(SwingConstants.TOP);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelTxt.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTxt.add(txtNombre);
		txtNombre.setColumns(25);
		
		lblNewLabel_1 = new JLabel("Ciudad:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelTxt.add(lblNewLabel_1);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelTxt.add(txtCiudad);
		txtCiudad.setColumns(25);
		
		panelLbl = new JPanel();
		panelContenido.add(panelLbl);
		panelLbl.setLayout(new CardLayout(0, 0));
		
		txtFrase = new JLabel("");
		txtFrase.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFrase.setHorizontalAlignment(SwingConstants.CENTER);
		panelLbl.add(txtFrase, "name_53819339814000");
		
		panelBtnAceptar = new JPanel();
		panelContenido.add(panelBtnAceptar);
		panelBtnAceptar.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBtnAceptar.add(btnAceptar);
		
		panelBtn = new JPanel();
		panelContenido.add(panelBtn);
		panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 35));
		
		btnActivar = new JButton("Activar");
		btnActivar.addActionListener(this);
		btnActivar.setEnabled(false);
		btnActivar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBtn.add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.addActionListener(this);
		btnDesactivar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panelBtn.add(btnDesactivar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnActivar) {
			btnActivar.setEnabled(false);
			btnDesactivar.setEnabled(true);
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
			btnAceptar.setEnabled(true);
		} else if (e.getSource() == btnDesactivar) {
			btnActivar.setEnabled(true);
			btnDesactivar.setEnabled(false);
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
			btnAceptar.setEnabled(false);
		} else if (e.getSource() == btnAceptar) {
			txtFrase.setText("Ustes se llama " + txtNombre.getText() + " y vive en " + txtCiudad.getText());
		}
	}
}
