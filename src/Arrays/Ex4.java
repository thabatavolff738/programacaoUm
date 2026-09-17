package Arrays;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int[] numeros = new int[15];

	        int pares = 0;
	        int impares = 0;
	        int maiores10 = 0;
	        int menores10 = 0;

	        for (int i = 0; i < numeros.length; i++) {

	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            numeros[i] = sc.nextInt();

	            if (numeros[i] % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }

	            if (numeros[i] > 10) {
	                maiores10++;
	            } else {
	                menores10++;
	            }
	        }

	        System.out.println("\nQuantidade de pares: " + pares);
	        System.out.println("Quantidade de ímpares: " + impares);
	        System.out.println("Maiores que 10: " + maiores10);
	        System.out.println("Menores ou iguais a 10: " + menores10);

	}

}
