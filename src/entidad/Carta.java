package entidad;

public class Carta {
	public enum PALO {OROS, COPAS, ESPADAS, BASTOS};
	public PALO palos;
	private int numero; 
	private final static String[] figura = {"As","2","3","4","5","6","7","Sota","Caballo","Rey"}; //haciendo lo final no se puede cambiar desde fuera
	private final static int[] puntuacion = {11,2,3,4,5,6,7,10,10,10};
	
	public Carta(PALO palos, int numero) {
		setPalos(palos);
		setNumero(numero);
	}

	public PALO getPalos() {
		return palos;
	}

	public void setPalos(PALO palos) {
		this.palos = palos;
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero; 
	} 
	
//	Valor calculado respecto al número
	public int getPuntuacion(){
		return puntuacion[numero-1];  
	}
	
//	muestra figura respeto al número
	public String getFigura() {
		return figura[numero-1];
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getFigura()+ " de " + getPalos().toString().toLowerCase()+", ";
	}

	
	
	
	
	
}