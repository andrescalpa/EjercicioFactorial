import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int)(Math.random()*100);//declaro la variable donde va a ir almacenado el numero aleatorio hago refundicion con (int) para que le numer generado como double se convierta en int

		Scanner entrada = new Scanner(System.in);//Aqui se va a almacenar el valor que entra por consola

		int numero = 0; //inicializa la variable en la cual va a ir el numero que entro por consola

		int intentos = 0; //numero de intentos para adivinar el numero aleatorio

		while(numero != aleatorio){//para hacerlo con do-while se enviaria la condicion del while al final de la las llaves y se coloca un do al inicio
			intentos++;
			System.out.println("Introduce número, por favor.");
			numero = entrada.nextInt();

			if (aleatorio < numero){

				System.out.println("El numero aleatorio es más bajo.");
			}
			
			else if (aleatorio > numero){
				
				System.out.println("El numero aleatorio es más alto.");				
			}

		}
		
		System.out.println("Correcto lo has logrado en " + intentos +" intentos.");
	}

}
