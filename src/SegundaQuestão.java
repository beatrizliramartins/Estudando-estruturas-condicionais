import java.util.Scanner;

public class SegundaQuestão {

	public static void main(String[] args) {
	
		//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração
		
		Scanner LerTeclado = new Scanner(System.in);
		
		double numero1, numero2, soma, subtracao, multiplicacao, divisao;
		
		System.out.println("Digite o primeiro numero");
		numero1 = LerTeclado.nextDouble();
		
		System.out.println("Digite o segundo numero");
		numero2 = LerTeclado.nextDouble();
		
		soma = numero1 + numero2; 
		
		System.out.println("Resultado \n" +soma);
		
		System.out.println("Digite o primeiro numero");
		numero1 = LerTeclado.nextDouble();
		
		System.out.println("Digite o segundo numero");
		numero2 = LerTeclado.nextDouble();
		
		subtracao = numero1 - numero2; 
		
		System.out.println("Resultado \n" +subtracao);
		
		System.out.println("Digite o primeiro numero");
		numero1 = LerTeclado.nextDouble();
		
		System.out.println("Digite o segundo numero");
		numero2 = LerTeclado.nextDouble();
		
		multiplicacao = numero1 * numero2; 
		
		System.out.println("Resultado \n" + multiplicacao);
		
		System.out.println("Digite o primeiro numero");
		numero1 = LerTeclado.nextDouble();
		
		System.out.println("Digite o segundo numero");
		numero2 = LerTeclado.nextDouble();
		
		divisao = numero1 / numero2; 
		
		System.out.println("Resultado \n" +divisao);


		

	}

}
