import java.util.Scanner;

public class TerceiraQuest�o {

	public static void main(String[] args) {
		
		//Escrever um algoritmo para determinar o consumo m�dio de um autom�vel
		//sendo fornecida a dist�ncia total
		//percorrida pelo autom�vel e o total de combust�vel gasto.
		
		Scanner LerTeclado = new Scanner(System.in);
		
		double  valorGasolina, TotalPercorrido, ConsumoMedio;
		
		System.out.println("Digite o valor da gasolina:");
		valorGasolina = LerTeclado.nextDouble();
		
		System.out.println("Digite o total percorrido:");
		TotalPercorrido = LerTeclado.nextDouble();
		
		ConsumoMedio = valorGasolina / TotalPercorrido;
		
		System.out.println("Consumo M�dio\n:" + ConsumoMedio);
		

	}

}
