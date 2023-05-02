package ej5;

public class Triángulo extends Polígono {
	
	double lado1;
	double lado2;
	double lado3;
	
	
	
	
	public Triángulo(int numerolados, double lado1, double lado2, double lado3) {
		super(numerolados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Es un Triángulo, cuyos lados son " + lado1 + ", " + lado2+" y "+lado3;
	}
	
	
	
}
