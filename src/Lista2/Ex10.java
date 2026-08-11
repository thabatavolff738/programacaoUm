package Lista2;
public class Ex10 {
	public static void main(String[] args) {
		
		int totalAlunos = 23;
		int grupos = 5;
		int divisaoInteira;
		double divisaoReal;

		divisaoInteira = totalAlunos / grupos;
		divisaoReal = (double) totalAlunos / grupos;

		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão real: " + divisaoReal);
	}

}
