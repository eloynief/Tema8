package ej3;

public class NoPerecedero extends Productos {

	//muestra el tipo del producto
	String tipo;
	
	//constuctor
	NoPerecedero(String nombre, int numero,String tipo) {
		super(nombre, numero);
		//elemento tipo en el constructor
		this.tipo=tipo;
		// TODO Auto-generated constructor stub
	}
	
	//metodo get
	public String getTipo() {
		return tipo;
	}

	//metodo set
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//metodo toString
	@Override
	public String toString(){
		return nombre;
	}
	
}
