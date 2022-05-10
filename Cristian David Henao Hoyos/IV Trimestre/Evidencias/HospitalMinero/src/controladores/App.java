package controladores;

import vistas.MenuPrincipal;

public class App {

	public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal(new Coordinador());
		menu.setVisible(true);
	}

}
