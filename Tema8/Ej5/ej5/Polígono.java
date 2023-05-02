package ej5;

public abstract class Polígono {

	//atributos
	int numerolados;
	
	abstract void area();
	
	
	
	
	public Polígono(int numerolados) {
		this.numerolados = numerolados;
	}




	public int getNumerolados() {
		return numerolados;
	}




	public void setNumerolados(int numerolados) {
		this.numerolados = numerolados;
	}




	@Override
	public String toString() {
		return "Polígono [numerolados=" + numerolados + "]";
	}
	
	
	
	
}
