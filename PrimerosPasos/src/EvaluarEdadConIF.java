import java.util.*;
public class EvaluarEdadConIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub-
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Intrduzca su edad por favor:");
		
		int edad = entrada.nextInt();
		
		if(edad<18){
			System.out.println("Eres adolescente");
		}
		
		else if(edad<40){
			System.out.println("Eres joven");
		}
		
		else if(edad<65){
			System.out.println("Eres maduro");
		}
		else{
			System.out.println("Cuidate");
		}
	}

}
