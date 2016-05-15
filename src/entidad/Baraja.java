package entidad;

import java.util.Collections;
import java.util.Vector;

import entidad.Carta.PALO;

public class Baraja {
	private Vector<Carta> miCarta;
	
	private void iniciarJuego(){
		miCarta = new Vector<>(40);
//		Se que esto es una chapuza pero no se me ocurre otra manera de meterle mano
//		no se como meterle mano al enumerado para que varie asi me ahorraria 3 for
		for (int i = 1; i < 11; i++) {
			miCarta.add(new Carta(PALO.OROS, i)); 
		}
		
//		for (int i = 1; i < 11; i++) {
//			miCarta.add(new Carta(PALO.COPAS, i)); 
//		}
//		
//		for (int i = 1; i < 11; i++) {
//			miCarta.add(new Carta(PALO.ESPADAS, i)); 
//		}
//		
//		for (int i = 1; i < 11; i++) {
//			miCarta.add(new Carta(PALO.BASTOS, i)); 
//		}
		
	}
	
	public Baraja(){
		iniciarJuego();
	}
	
	public void barajar(){
		Collections.shuffle(miCarta);
	}
	
	public int getNumeroCartas(){
		return miCarta.size(); 
	}
	
	public Vector<Carta> reparte(){
		Vector<Carta> rv = new Vector<>();
		int n = 1; 
		for (int i = 0; i < n; i++) {
			rv.add(quitarCarta()); 
		}
		return rv; 
	}
	
	public Carta quitarCarta(){
		return miCarta.remove(0); 
	}
	
	@Override
	public String toString() {
		String mensaje = ""; 
		for(Carta c: miCarta)
			mensaje += c.toString(); 
		return "Baraja [miCarta=" + mensaje+ "]";
	}
}
