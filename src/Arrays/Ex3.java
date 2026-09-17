package Arrays;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        String[] alunos = new String[8];

	        for (int i = 0; i < alunos.length; i++) {

	            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
	            alunos[i] = sc.nextLine();
	        }

	        System.out.print("\nDigite o nome que deseja procurar: ");
	        String nome = sc.nextLine();

	        boolean encontrado = false;

	        for (int i = 0; i < alunos.length; i++) {

	            if (alunos[i].equalsIgnoreCase(nome)) {

	                System.out.println("Aluno encontrado na posição: " + i);

	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado == false) {
	            System.out.println("Aluno não encontrado.");
	        }

	}

}
