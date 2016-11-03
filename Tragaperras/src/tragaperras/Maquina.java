package tragaperras;

import java.util.Arrays;

public class Maquina {
	private final int casillas; 
	private double precio;
	private double credito;
	private Premio[] premios; 
	
	public Maquina(int casillas, double precio, Premio ...premios){
		this.casillas = casillas;
		this.precio = precio;
		credito = 0;
		this.premios = premios;
	}

	public int getCasillas() {
		return casillas;
	}
	
	public double getPrecio() { 
		return precio;
	}
	
	public double getCredito() {
		return credito;
	}
	
	public Premio[] getPremios() {
		return Arrays.copyOf(premios, premios.length);
	}
	
	public void incrementarCredito(double credito){
		this.credito += credito;
	}
	
	public double cobrar(){
		double aux = credito;
		credito = 0;
		return aux;
	}
	
	public Fruta[] jugar(){
		if (credito >= precio) {
			credito -= precio;
			Fruta[] combinacion = new Fruta[casillas];
			for(int i = 0; i < casillas; i++){
				combinacion[i] = Fruta.frutaRandom();
			}
			
			for(Premio premio: premios){
				if(Arrays.equals(combinacion, premio.getGanadora())){
					credito += premio.getPremio();
				} 
			}
			return combinacion; 
		} 
		return null;
	}
}
	



