package entidad;

public class Carta {
	public enum PALO {OROS, COPAS, ESPADAS, BASTOS
		
	};
	public PALO palos;
	private int numero; 
	private static String[] figura = {"As","2","3","4","5","6","7","Sota","Caballo","Rey"};
	private static int[] puntuacion = {11,2,3,4,5,6,7,10,10,10};
	
	public Carta(PALO palos, int numero) {
		setPalos(palos);
		setNumero(numero);
	}

	public PALO getPalos() {
		return palos;
	}

	private void setPalos(PALO palos) {
		this.palos = palos;
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if(numero>0 && numero<11)
			this.numero = numero;
		else
			System.out.println("Escriba un número entre 1 y 10.");
	} 
	
	private int getPuntuacion(){
			return puntuacion[numero-1];  
	}
	
	private String getFigura() {
		return figura[numero-1];
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getFigura()+ " de " + getPalos().toString().toLowerCase();
	}

	
	
	
	
	
}