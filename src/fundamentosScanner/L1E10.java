package fundamentosScanner;
import java.util.Scanner;
public class L1E10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o curso: ");
		String curso = entrada.nextLine();
		
		System.out.print("Digite a idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Aluno: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Idade: " + idade + " anos");
		

	}

}
