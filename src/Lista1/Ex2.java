package Lista1;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
	  Scanner cadastro = new Scanner(System.in);
		       double preco;
		       int codigo, quantidade;
		       String nomeProduto;
		       System.out.println("Insira o nome do produto:");
		       nomeProduto = cadastro.nextLine();
		       System.out.println("Insira o código do produto:");
		       codigo = cadastro.nextInt();
		       System.out.println("Insira o preço do produto:");
		       preco = cadastro.nextDouble();
		       System.out.println("Insira a quantidade em estoque:");
		       quantidade = cadastro.nextInt();


		       System.out.println("DADOS DO PRODUTO:");
		       System.out.println("Nome: " + nomeProduto);
		       System.out.println("Código: " + codigo);
}
}