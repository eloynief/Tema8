package ej3;

public class Perecedero extends Productos {

	//variable que sirve para mostrar los días a caducar
	int caducidad=0;
	double precio=0;

	//constructor de perecedero (obligatorio)
	Perecedero(String nombre, int numero,int caducidad) {
		super(nombre, numero);
		this.caducidad=caducidad;
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	//metodo get
	public int getCaducidad() {
		return caducidad;
	}
	
	//metodo set
	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}
	
	//la reducción es
	//en el get o en el constructor?
	public double getPrecio() {
		
		
		
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//metodo toString
		@Override
		public String toString(){
			return nombre;
		}
	
}
