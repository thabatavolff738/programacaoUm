package Lista1;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		
		Scanner cal = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Insra o primeiro número: ");
		num1 = cal.nextInt();
		
		System.out.println("Insira o segundo número: ");
		num2 = cal.nextInt();
		
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multiplicação: " + (num1 * num2));
		System.out.println("Divisão: " + (num1 / num2));
		System.out.println("Resto: " + (num1 % num2));

	}

}
