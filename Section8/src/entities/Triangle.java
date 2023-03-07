package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Triangle(){
		
	}
	
	public double calcularArea() { // não recebe parâmetros pois o atirubutos ja estão na propria class;
		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return area;
	}
}
