import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String NombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor.");
		String edad = JOptionPane.showInputDialog("Introduzca su edad por favor");
		int edadUsuario = Integer.parseInt(edad);
		System.out.println("Hola " + NombreUsuario + " tienes " + edadUsuario + " años.");
	}

}
