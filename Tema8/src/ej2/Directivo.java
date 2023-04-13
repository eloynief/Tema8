package ej2;

public class Directivo extends Empleado{
	
	
	
	
	Directivo(String nombre){
	super(nombre);
	}

	
	
	//te imprime el objeto como quieres que se imprima
		@Override
		public String toString() {
			
			
/**
* getNombre sirve para llamar el getnombre de la clase
* del extends de esta clase
*/
			String res="Empleado"+getNombre()+"->"+"Directivo";
			
			
			//return de todo lo que se ha escrito dentro
			return res;
		}
	
}
