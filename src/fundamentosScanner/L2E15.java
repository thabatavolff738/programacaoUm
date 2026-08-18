package fundamentosScanner;
import java.util.Scanner;
public class L2E15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o produto: ");
		String produto = entrada.nextLine();
		
		System.out.print("Digite o preço: ");
		String preco = entrada.nextLine();
		
		System.out.print("Digite o estoque: ");
		int estoque = entrada.nextInt();
		
		System.out.println("Produto: " + produto);
		System.out.println("Preço: R$" + preco);
		System.out.println("Estoque: " + estoque + " unidades");

	}

}
