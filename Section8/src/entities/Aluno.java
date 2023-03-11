package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculandoMedia() {
		return nota1 +nota2+ nota3;
	}
	
	public String toString() {
		return "FINAL GRADE = " + calculandoMedia();
	}
	
	public String passouReprovado() {
		String condicional = "";
		if(calculandoMedia() > 60) {
			condicional += "PASS";
			return condicional;
			
		} else {
			condicional += "FAILED";
			double precisando = 60 - calculandoMedia();
			return condicional + "\nMISSING " + precisando + "POINTS";
			
		}
	}
}
