package exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno al = new Aluno();
		al.nome = sc.nextLine();
		al.nota1 = sc.nextDouble();
		al.nota2 = sc.nextDouble();
		al.nota3 = sc.nextDouble();
		System.out.println(al);
		System.out.println(al.passouReprovado());
		
		
		sc.close();

	}

}
