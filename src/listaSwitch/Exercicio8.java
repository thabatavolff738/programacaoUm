package listaSwitch;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Sala 1");
        System.out.println("2 - Sala 2");

        System.out.print("Digite a sala: ");
        int sala = entrada.nextInt();

        System.out.print("Digite o número do filme: ");
        int filme = entrada.nextInt();

        switch (sala) {
            case 1:
                switch (filme) {
                    case 1:
                        System.out.println("Aventura");
                        break;
                    case 2:
                        System.out.println("Comédia");
                        break;
                    case 3:
                        System.out.println("Ficção Científica");
                        break;
                    default:
                        System.out.println("Filme inválido.");
                }
                break;

            case 2:
                switch (filme) {
                    case 1:
                        System.out.println("Terror");
                        break;
                    case 2:
                        System.out.println("Romance");
                        break;
                    case 3:
                        System.out.println("Animação");
                        break;
                    default:
                        System.out.println("Filme inválido.");
                }
                break;

            default:
                System.out.println("Sala inválida.");
        }
    }
}