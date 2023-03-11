package entities;

public class Retangle {
	
	
	public double height;
	public double width;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f", Area())
				+ "\nPERIMETER = "
				+ String.format("%.2f", Perimeter())
				+ "\nDIAGONAL = "
				+ String.format("%.2f", Diagonal());
	}
}
