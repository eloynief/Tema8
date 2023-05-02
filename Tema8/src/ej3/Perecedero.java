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
		//si caduca el día siguiente, el precio
		//se vuelve 1/4 del precio esperado
		if (caducidad==1) {
			precio=precio/4;
		}
		//si caduca en 2 días, entonces se vuelve un tercio del precio
		else if (caducidad==2) {
			precio=precio/3;
		}
		//si caducidad es 3, el precio se vuelve la mitad
		else if (caducidad==3) {
			precio=precio/2;
		}
		
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//metodo toString
	//el tostring muestra como quieres que se imprima por pantalla esa parte
	
		@Override
		public String toString(){
			
			return nombre;
		}
	
}
