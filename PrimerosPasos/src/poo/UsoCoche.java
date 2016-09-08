package poo;

import java.awt.Color;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche miCoche= new Coche();
		
		miCoche.establece_color("Negro");
		
		System.out.println(miCoche.dameDatosGenerales());
				
		System.out.println(miCoche.dime_color());
		
		miCoche.configuraAsientos("SI");
		
		System.out.println(miCoche.dime_asientos());
	}

}
