import java.util.Scanner;

public class PrimeiraQuestão {

	public static void main(String[] args) {
			
		//Faça um algoritmo que receba dois números e exiba o resultado da sua soma.
		
		Scanner LerNumero = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double soma;
		
		System.out.println("Digite o primeiro numero:");
		numero1 = LerNumero.nextDouble();
		
		System.out.println("Digite o segundo numero:");
		numero2 = LerNumero.nextDouble();
		
		soma = numero1 + numero2;
		
		System.out.println("Resultado da soma\n" +  soma);
		
		
	}
}	
		