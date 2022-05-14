package vistas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import controladores.Ventanas;
import controladores.Coordinador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MenuPrincipal extends JFrame implements ActionListener {

	private Coordinador cor;
	private JPanel ventanaPrinicpal;
	private JLabel lblTitulo;
	private JPanel panelOpciones;
	private JButton btnConsultar;
	private JButton btnRegistrar;
	
	public MenuPrincipal(Coordinador cor) {
		this.cor = cor;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 400);
		setLocationRelativeTo(null);
		iniciarComponentes();
		setContentPane(ventanaPrinicpal);
	}
	
	public void iniciarComponentes() {
		ventanaPrinicpal = new JPanel();
		ventanaPrinicpal.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaPrinicpal.setLayout(new BorderLayout(90, 0));
		
		lblTitulo = new JLabel(" Hospital San Nicol\u00E1s");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Yu Gothic UI", Font.BOLD, 35));
		lblTitulo.setBorder(new EmptyBorder(20,10,20,10));
		ventanaPrinicpal.add(lblTitulo, BorderLayout.NORTH);
		
		panelOpciones = new JPanel();
		ventanaPrinicpal.add(panelOpciones, BorderLayout.CENTER);
		panelOpciones.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 90));
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setBorder(new EmptyBorder(10,10,10,10));
		btnConsultar.setFocusPainted(false);
		btnConsultar.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnConsultar.setBackground(new Color(54, 211, 217));
		panelOpciones.add(btnConsultar);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBorder(new EmptyBorder(10,10,10,10));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		btnRegistrar.setBackground(new Color(54, 211, 217));
		panelOpciones.add(btnRegistrar);
		
		// Acciones
		btnConsultar.addActionListener(this);
		
		btnRegistrar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			Ventanas.openRegistrar(cor);
		} else if (e.getSource() == btnConsultar) {
			Ventanas.openConsultar(cor);
		}
	}

}
