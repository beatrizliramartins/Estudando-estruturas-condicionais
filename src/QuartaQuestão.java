import java.util.Scanner;

public class QuartaQuestão {

	public static void main(String[] args) {
		
	    //Escrever um algoritmo que leia o nome de um vendedor, 
		//o seu salário fixo e o total de vendas efetuadas por ele
		//no mês (em dinheiro). Sabendo que este vendedor ganha 20% de comissão 
		//sobre suas vendas efetuadas,
		//informar o seu nome, o salário fixo e salário no final do mês.
		
		Scanner LerNome = new Scanner(System.in);
		Scanner LerSalario = new Scanner(System.in);
		Scanner TotalDeVendas = new Scanner(System.in);
		
		String nome = "";
		double salario, totalDeVendas, comissao;
		
		
		System.out.println("Digite o seu nome:");
		nome = LerNome.nextLine();
		
		System.out.println("Digte o salário fixo:");
		salario = LerSalario.nextDouble();
		
		System.out.println("Digite o total de vendas que o vendedor realizou:");
		totalDeVendas = TotalDeVendas.nextDouble();
		
		comissao = salario / totalDeVendas * 200;
		
		System.out.println("Nome:" +nome);
		System.out.println("Salário Fixo" +salario);
		System.out.println("Comissão:" +comissao);
		
		

	}

}
