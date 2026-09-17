package Arrays;
import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        double[][] notas = new double[5][4];

		        // Preenchendo as notas

		        for (int i = 0; i < notas.length; i++) {

		            System.out.println("\nAluno " + (i + 1));

		            for (int j = 0; j < notas[i].length; j++) {

		                System.out.print("Digite a nota " + (j + 1) + ": ");
		                notas[i][j] = sc.nextDouble();
		            }
		        }

		        double maiorMedia = 0;
		        double menorMedia = 0;

		        int alunoMaior = 0;
		        int alunoMenor = 0;

		        double somaTotal = 0;

		        int aprovados = 0;

		        for (int i = 0; i < notas.length; i++) {

		            double somaAluno = 0;

		            for (int j = 0; j < notas[i].length; j++) {

		                somaAluno = somaAluno + notas[i][j];
		                somaTotal = somaTotal + notas[i][j];
		            }

		            double media = somaAluno / notas[i].length;

		            System.out.println("Aluno " + (i + 1)
		                    + " - Média: " + media);

		            if (i == 0) {

		                maiorMedia = media;
		                menorMedia = media;

		            } else {

		                if (media > maiorMedia) {
		                    maiorMedia = media;
		                    alunoMaior = i;
		                }

		                if (media < menorMedia) {
		                    menorMedia = media;
		                    alunoMenor = i;
		                }
		            }

		            if (media >= 7) {
		                aprovados++;
		            }
		        }

		        double mediaTurma = somaTotal / 20;

		        System.out.println("\nMaior média: Aluno "
		                + (alunoMaior + 1) + " - " + maiorMedia);

		        System.out.println("Menor média: Aluno "
		                + (alunoMenor + 1) + " - " + menorMedia);

		        System.out.println("Média da turma: " + mediaTurma);

		        System.out.println("Alunos aprovados: " + aprovados);

		      
	}

}
