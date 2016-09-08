import javax.swing.*;
public class AccesoAplicacionWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "andres";
		
		String claveEntrada = "";
		
		while (clave.equals(claveEntrada) == false){
			
			claveEntrada=JOptionPane.showInputDialog("Introduzca contraseña, por favor.");
			
			if (clave.equals(claveEntrada) == false){
				
				System.out.println("Contraseña incorrecta.");
				
			}
		}
		 System.out.println("Contraseña correcta");
	}

}
