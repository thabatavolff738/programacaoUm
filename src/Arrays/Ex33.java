package Arrays;
import java.util.Scanner;
public class Ex33 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        int[][] estoque = new int[3][4];

		        for (int i = 0; i < estoque.length; i++) {

		            System.out.println("\nProduto " + (i + 1));

		            for (int j = 0; j < estoque[i].length; j++) {

		                System.out.print("Digite o estoque do período "
		                        + (j + 1) + ": ");

		                estoque[i][j] = sc.nextInt();
		            }
		        }

		        int estoqueTotal = 0;
		        int maior = 0;
		        int produtoMaior = 0;

		        for (int i = 0; i < estoque.length; i++) {

		            int totalProduto = 0;

		            for (int j = 0; j < estoque[i].length; j++) {

		                totalProduto = totalProduto + estoque[i][j];
		            }

		            System.out.println("Produto " + (i + 1) + ": "
		                    + totalProduto + " unidades");

		            estoqueTotal = estoqueTotal + totalProduto;

		            if (totalProduto > maior) {

		                maior = totalProduto;
		                produtoMaior = i;
		            }
		        }

		        System.out.println("\nEstoque total: "
		                + estoqueTotal + " unidades");

		        System.out.println("Maior estoque acumulado: Produto "
		                + (produtoMaior + 1));
		    }
	}

