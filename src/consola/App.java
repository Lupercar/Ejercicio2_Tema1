package consola;

import entidad.Carta;
import entidad.Carta.PALO;
import entidad.Mano;

public class App {

	public static void main(String[] args) {
		//prueba de la clase Carta
		Carta miCarta = new Carta(PALO.OROS,1);
		System.out.println(miCarta.toString()+"\n");
		
		//prueba de mano
		Mano miMano = new Mano(3); 
		miMano.reparte(miCarta, new Carta(PALO.BASTOS, 9), new Carta(PALO.ESPADAS,10));
		System.out.println("Puntuación: "+miMano.sumaPuntuacion());
		System.out.println(miMano);
	}
}
