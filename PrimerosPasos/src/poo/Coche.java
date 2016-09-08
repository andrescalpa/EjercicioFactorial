package poo;

public class Coche {

	//Declarar variables
	
	private int ruedas;
	private int motor;
	private int largo;
	private int ancho;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	 
	
	//Crear el constructor de la clase
	
	public Coche(){
		
		ruedas=4;
		motor=1600;
		largo=2000;
		ancho=300;
		peso_plataforma=500;
	}
	
	public String dimeLargo(){//getter
		return "El largo del coche es " + largo + "cm";
	}
	
	public void establece_color(String color_coche){//setter
		
		color = color_coche;
	}
	
	public String dime_color(){
		return "El color del coche es " + color;
	}
	
	public String dameDatosGenerales(){
		return "La plataforma del veihulo tiene " + ruedas + "ruedas,mide"
				+ largo/1000 + "metros de largo con una ancho de "
				+ ancho +"cm y un peso de plataforma de "
				+ peso_plataforma + "Kg";
	}
	
	public void configuraAsientos(String asientos_cuero){//Setter
		
		if(asientos_cuero=="si"){
			this.asientos_cuero=true;
		}
		else{
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos(){//Getter
		
		if(asientos_cuero==true){
			
			return "El coche tiene asintos de cuero";
		}
		else{
			return "El coche tiene asientos de serie";
		}
	}
}
