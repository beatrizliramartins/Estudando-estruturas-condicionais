import java.util.Scanner;

public class TerceiraQuestão {

	public static void main(String[] args) {
		
		//Escrever um algoritmo para determinar o consumo médio de um automóvel
		//sendo fornecida a distância total
		//percorrida pelo automóvel e o total de combustível gasto.
		
		Scanner LerTeclado = new Scanner(System.in);
		
		double  valorGasolina, TotalPercorrido, ConsumoMedio;
		
		System.out.println("Digite o valor da gasolina:");
		valorGasolina = LerTeclado.nextDouble();
		
		System.out.println("Digite o total percorrido:");
		TotalPercorrido = LerTeclado.nextDouble();
		
		ConsumoMedio = valorGasolina / TotalPercorrido;
		
		System.out.println("Consumo Médio\n:" + ConsumoMedio);
		

	}

}
