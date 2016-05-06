package consola;

import entidad.Carta;
import entidad.Carta.PALO;

public class App {

	public static void main(String[] args) {
		//prueba de la clase Carta
		Carta miCarta = new Carta(PALO.OROS,10); 
		System.out.println(miCarta);
	}
}
