package entidad;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Mano {

	// Lo pongo final para que una vez creado el array no se pueda cambiar el
	// tamaño
	private final Carta[] miCarta;

	// En el constructor indico el número de cartas
	public Mano(int numeroCartas) {
		miCarta = new Carta[numeroCartas];
	}

	// Retorna el número de cartas
	public int getNumeroCartas() {
		return miCarta.length;
	}

	public void reparte( Carta ... cartasReparto) {
		if(getNumeroCartas() == cartasReparto.length)
		System.arraycopy(cartasReparto, 0, miCarta, 0, getNumeroCartas());
	}

	public int sumaPuntuacion(){
		int puntos = 0;
		for(Carta c: miCarta){
			if(c!=null) //comprobamos que no haya nulos
			puntos += c.getPuntuacion(); 
		}
		return puntos; 
	}
	
	@Override
	public String toString() {
		String mensaje = ""; 
		for(Carta c: miCarta){
			mensaje +=  c.toString(); 
		}
		return mensaje; 
	}
}
