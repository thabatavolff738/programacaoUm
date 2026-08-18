package fundamentosScanner;
import java.util.Scanner;
public class L1E9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Possui ingresso? (true/false): ");
		boolean possuiIngresso = entrada.nextBoolean();
		
		System.out.print("Possui documento? (true/false): ");
		boolean possuiDocumento = entrada.nextBoolean();
		
		System.out.print("Acompanhante é maior de idade? (true/false): ");
		boolean acompanhanteMaiorIdade = entrada.nextBoolean();
		
		System.out.println("\nResultados:");
		
		System.out.println("Ingresso E documento: "+ (possuiIngresso && possuiDocumento));
		
		System.out.println("Ingresso OU documento: "+ (possuiIngresso || possuiDocumento));
		
		System.out.println("Não possui documento: "+ (!possuiDocumento));
		
		System.out.println("Ingresso E (documento OU acompanhante maior): "+ (possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)));
		
		System.out.println("Não (ingresso E documento): "+ (!(possuiIngresso && possuiDocumento)));


	}

}
