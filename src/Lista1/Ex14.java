package Lista1;

public class Ex14 {

	public static void main(String[] args) {
		String nome = "João";
		double salario = 2500.00;
		int tempoEmpresa = 6;

		double bonus = (tempoEmpresa >= 5) ? 500.00 : 0.00;

		double salarioFinal = salario + bonus;

		System.out.println("Nome: " + nome);
		System.out.println("Salário: R$ " + salario);
		System.out.println("Bônus: R$ " + bonus);
		System.out.println("Salário Final: R$ " + salarioFinal);

	}

}
