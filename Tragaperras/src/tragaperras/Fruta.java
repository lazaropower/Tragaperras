package tragaperras;

import java.util.Random;

public enum Fruta {
	FRESA, SANDIA, PLATANO, MELOCOTON, PERA;

	public static Fruta frutaRandom(){
		Random generador = new Random();
		Fruta[] frutarandom = Fruta.values();	
		return frutarandom[generador.nextInt(frutarandom.length)];		
	}
}
