import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do Array: ");
		int num = sc.nextInt();
		
		int[] meuArray = new int[num];
		
		//Adicionando valores ao meu array
		for(int i = 0; i < num; i++) {
			meuArray[i] = sc.nextInt(); 
		}
		
		int maiorNegativo = Integer.MIN_VALUE; //menor valor possivel de um inteiro
		int menorPositivo = Integer.MAX_VALUE; //maior valor possivel de um inteiro
		
		
		//Descobrindo maior numero negativo e menor positivo
		for(int i = 0; i < meuArray.length;i++) {
			if  (meuArray[i] < 0 && meuArray[i] > maiorNegativo) {
				maiorNegativo = meuArray[i];
			} else if(meuArray[i] > 0 && meuArray[i] < menorPositivo) {
				menorPositivo = meuArray[i];
			}
		}
		
		
		double soma = 0;
		int contPositivo = 0;
		int contNegativo = 0;
		
		// descobrindo a quantidade de numeros negativos, positivos e a media.
		for(int numeros : meuArray) {
			soma += numeros;
			if (numeros > 0) {
				contPositivo ++;
			} else if(numeros < 0) {
				contNegativo++;
			} else {
				continue;
			}
			
		}
		
		double media = soma/num;
		System.out.println("Maior Negativo: " + maiorNegativo);
		System.out.println("Menor Positivo: " + menorPositivo);
		System.out.printf("Media aritmética: %.2f\n", media);
		System.out.println("Quantidade de Positivo: " + contPositivo);
		System.out.println("Quantidade de Negativos: " + contNegativo);
		
		
		sc.close();
	}

}
