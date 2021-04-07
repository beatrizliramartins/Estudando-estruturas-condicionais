import java.util.Scanner;

public class SextaQuestão {

	public static void main(String[] args) {
		// O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos
		//impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do
		//distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 30% e os impostos 55%.
		//Escrever um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo.
		
		Scanner LerCustos = new Scanner(System.in);
		Scanner LerImp = new Scanner(System.in);
		double CustoFab, CustoImp, CustoVeiculo, CustoDistribuidor = 300, ResultadoImp, ResultadoDistribuidor;
		
		System.out.println("Digite os custos do veículo:");
		CustoFab = LerCustos.nextDouble();
		
		CustoVeiculo = CustoFab + CustoDistribuidor * 300;
		
		ResultadoImp = CustoFab * 55/100;
		
		
		
		System.out.println("Valor total do veículo + impostos:\n" +ResultadoImp);
		
		
		ResultadoDistribuidor = CustoFab + ResultadoImp * 30/100; 

		System.out.println("Valor total do veículo + impostos + Imp Distribuição:\n" +ResultadoDistribuidor);

		
		

	}

}
