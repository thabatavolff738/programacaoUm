package Lista1;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner i = new Scanner (System.in);
		int idd = 17;
		
		System.out.println("Digite sua idade: ");
		idd = i.nextInt();
		
		if(idd >= 17) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}

	}

}
