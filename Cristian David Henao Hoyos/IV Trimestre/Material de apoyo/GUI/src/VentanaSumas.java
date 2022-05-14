import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaSumas extends JFrame {

	private JPanel ventanaPrincipal;

	public VentanaSumas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);
		ventanaPrincipal = new JPanel();
		setContentPane(ventanaPrincipal);
	}
	
	private void inciarComponentes() {
		ventanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaPrincipal.setLayout(new BorderLayout(0, 0));
	}

}
