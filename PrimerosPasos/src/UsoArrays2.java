import javax.swing.JOptionPane;


public class UsoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String [] paises = new String[8];
		
		for (int i = 0; i<8; i++){
			
			paises[i] = JOptionPane.showInputDialog("Introduce el pais número " + (i+1));
			
		}
		
		for(String elemento:paises){
			
			System.out.println("Pais: " + elemento);
			
		}*/
		
		int[] numerosAleatorios = new int[150];
		
		for(int i=0; i<numerosAleatorios.length; i++){
			
			numerosAleatorios[i]=(int)Math.round(Math.random()*100);			
		}
		
		for (int numero:numerosAleatorios){
			
			System.out.print(numero + " ");			
		}
	}

}
