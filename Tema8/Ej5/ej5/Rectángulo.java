package ej5;

public class Rectángulo extends Polígono {
	double lado1;
	double lado2;
	
	
	
	
	
	
	
	public Rectángulo(int numerolados, double lado1, double lado2) {
		super(numerolados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Es un Rectángulo, cuyos lados son " + lado1 + ", y " + lado2;
	}

	
	
	
}
