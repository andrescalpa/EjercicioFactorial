import java.util.Scanner;


public class entradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca nombre");
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introducir edad");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombreUsuario + ", el a�o que viene tendras " + (edad+1) + " a�os.");
	}

}
