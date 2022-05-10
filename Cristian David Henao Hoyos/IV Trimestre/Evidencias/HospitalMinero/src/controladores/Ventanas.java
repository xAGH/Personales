package controladores;

import vistas.Consulta;
import vistas.Registro;

public class Ventanas {
	
	private static Consulta dialogConsulta;
	private static Registro dialogRegistro;
	
	public static void openConsultar(Coordinador cor) {
		dialogConsulta = new Consulta(cor);
		dialogConsulta.setVisible(true);
	}
	
	public static void openRegistrar(Coordinador cor) {
		dialogRegistro = new Registro(cor);
		dialogRegistro.setVisible(true);
	}
	
}
