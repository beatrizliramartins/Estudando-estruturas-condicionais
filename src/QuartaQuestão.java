import java.util.Scanner;

public class QuartaQuest�o {

	public static void main(String[] args) {
		
	    //Escrever um algoritmo que leia o nome de um vendedor, 
		//o seu sal�rio fixo e o total de vendas efetuadas por ele
		//no m�s (em dinheiro). Sabendo que este vendedor ganha 20% de comiss�o 
		//sobre suas vendas efetuadas,
		//informar o seu nome, o sal�rio fixo e sal�rio no final do m�s.
		
		Scanner LerNome = new Scanner(System.in);
		Scanner LerSalario = new Scanner(System.in);
		Scanner TotalDeVendas = new Scanner(System.in);
		
		String nome = "";
		double salario, totalDeVendas, comissao;
		
		
		System.out.println("Digite o seu nome:");
		nome = LerNome.nextLine();
		
		System.out.println("Digte o sal�rio fixo:");
		salario = LerSalario.nextDouble();
		
		System.out.println("Digite o total de vendas que o vendedor realizou:");
		totalDeVendas = TotalDeVendas.nextDouble();
		
		comissao = salario / totalDeVendas * 200;
		
		System.out.println("Nome:" +nome);
		System.out.println("Sal�rio Fixo" +salario);
		System.out.println("Comiss�o:" +comissao);
		
		

	}

}
