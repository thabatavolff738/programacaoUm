package Arrays;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        double[] notas = new double[5];
		        double soma = 0;

		        for (int i = 0; i < notas.length; i++) {

		            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
		            notas[i] = sc.nextDouble();

		            soma = soma + notas[i];
		        }

		        System.out.println("\nNotas dos alunos:");

		        for (int i = 0; i < notas.length; i++) {
		            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
		        }

		        double media = soma / notas.length;

		        System.out.println("Média da turma: " + media);

		    }
}
