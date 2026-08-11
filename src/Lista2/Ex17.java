package Lista2;

public class Ex17 {

	public static void main(String[] args) {
		int estoque = 3;
		String situacao = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";
		System.out.println("Estoque: " + estoque);
		System.out.println("Situação: " + situacao);
	}
}
