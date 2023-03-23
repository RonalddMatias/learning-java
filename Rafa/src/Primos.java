
public class Primos {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printarArray(array);
		printarPrimos(numPrimo);
	}

	public static void printarArray(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
		}
	}

	public static void printarPrimos(int[] vetor) {
		int numDivisores = 0;

		for (Integer numPrimo : array) {
			for (int i = 1; i <= numPrimo; i++) {
				if (numPrimo % i == 0) {
					numDivisores++;
				}
				if (numDivisores == 2) {
					System.out.print(vetor[i]);
				}
				numDivisores = 0;
			}
		}
	}
}
