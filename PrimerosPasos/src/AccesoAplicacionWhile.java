import javax.swing.*;
public class AccesoAplicacionWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "andres";
		
		String claveEntrada = "";
		
		while (clave.equals(claveEntrada) == false){
			
			claveEntrada=JOptionPane.showInputDialog("Introduzca contrase�a, por favor.");
			
			if (clave.equals(claveEntrada) == false){
				
				System.out.println("Contrase�a incorrecta.");
				
			}
		}
		 System.out.println("Contrase�a correcta");
	}

}
