package ej3;

public class Productos {

	String nombre="";
	int numero=0;
	public double calcular(int numero) {
		double calculofinal=0;
		
		
		
		
		return calculofinal;
	}
	
	//constructor de valores
	Productos(String nombre, int numero){
		this.nombre=nombre;
		this.numero=numero;
	}
	
	
	//metodo get
	public String getNombre() {
		return nombre;
	}
	//metodo set
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//metodo get
	public int getNumero() {
		return numero;
	}
	//metodo set
	public void setNumero(int numero) {
		this.numero = numero;
	}

	//metodo toString
	@Override
	public String toString(){
		return nombre;
	}
	
}
