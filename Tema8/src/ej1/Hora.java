package ej1;

public class Hora {
	
	
	//creación de variables
	protected int hora=0;
	protected int minuto=0;
	
	
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	
	
	public void inc() {
		if (minuto>59){
			hora++;
		}
	}
	
	boolean setMinuto(int min) {
		
		
		boolean esvalido=false;
		if(min>=0||min<60) {
		esvalido=true;	
		}
		return esvalido;
		
		
	}
	
	//
	boolean setHora(int h) {
		
		
		boolean esvalido=false;
		if(h>=0||h<60) {
		esvalido=true;	
		}
		return esvalido;
		
		
	}
	
	
	
	/*public String toString() {
		String tiempo;
		tiempo=hora+":"+minuto+":"+segundo;
		
		
		return tiempo;
	}
	*/
	
	
	
	
}
