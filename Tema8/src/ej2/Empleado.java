package ej2;

public class Empleado {

	private String nombre="";
	
	Empleado(){
		
	}
	
	Empleado(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//te imprime el objeto como quieres que se imprima
	@Override
	public String toString() {
		
		
		String res="Empleado"+nombre;
		
		
		//return de todo lo que se ha escrito dentro
		return res;
	}
	
	
	
}
