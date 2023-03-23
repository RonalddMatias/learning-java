import java.util.List;

public class Primos1 {

	public static void main(String[] args) {
		int[] array = {7, 4, 10, 1, 13, 6, 3, 0};
		printarArray(array);
		printarPrimos(array);
	}
	
	public static void printarArray(int[] array) {
		String[] arrayString = new String[array.length]; //criando um novo array de strisg 
		
		String output = "";
		
		for(int i = 0; i < array.length; i++) {
			arrayString[i] = String.valueOf(array[i]);
		}
		
		for (String numeros : arrayString) {
			if(output.equals("")) {
				output += numeros;
			} else { 
				output += " " + numeros;
			}
			
		}
		
		System.out.println(output);
		
	}
	
	public static void printarPrimos(int[] array) {
		System.out.println("Numeros Primos: ");
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			boolean primo = true;
			
			// tirando o 1 pois todo numero é dividido por 1
			if (num <= 1) {
				primo = false;
			} else {
				for (int q = 2; q < num; q++) {
					if (num % q == 0) {
						primo = false;
						break;
					}
				}
			}
			if(primo) {
				System.out.println(num + " ");
			}
		}
	}
} 

