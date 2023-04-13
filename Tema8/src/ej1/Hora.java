package ej1;

public class Hora {
	
	
	//creación de variables
	protected int hora=0;
	protected int minuto=0;
	
	//constructor con parámetros
	public Hora(int hora, int minuto) {
		if(hora>=0 && hora<=59) {
			this.hora=hora;
		}
		if(hora>=0 && hora<=59) {
			this.minuto=minuto;
		}
	}
	
	/*public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}*/

	
	
	public void inc() {
		if (minuto>59){
			minuto=0;
			hora++;
		}
		//igualar la hora a 0 cuando supera las 23
		if(hora>23) {
			hora=0;
		}
	}
	
	public boolean setMinuto(int min) {
		
		
		boolean esvalido=false;
		
		
		if(min>0&&min<60) {
			
			esvalido=true;	
		}
		
		//devuelve el boolean
		return esvalido;
		
		
	}
	
	//
	boolean setHora(int h) {
		
		
		boolean esvalido=false;

		if(h>=0&&h<24) {
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
	
	
	@Override
	public String toString() {
		
		
		String res="";
		
		//si la hora es de una cifra, se le pone el 0 al principio
		if(hora<=9) {
			
			res +="0";
		}
		
		//se le pone la cifra de la hora
		res += hora+":";
		
		if(minuto<=9) {
			//hace que se muestre como 09 cuando el numero es de una cifra
			res+="0";
		}
		
		//return de todo lo que se ha escrito dentro
		return res;
	}
	
	
}
