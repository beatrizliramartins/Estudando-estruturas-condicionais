import java.util.Scanner;

public class SextaQuest�o {

	public static void main(String[] args) {
		// O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos
		//impostos (aplicados, primeiro os impostos sobre o custo de f�brica, e depois a percentagem do
		//distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 30% e os impostos 55%.
		//Escrever um algoritmo que leia o custo de f�brica de um carro e informe o custo ao consumidor do mesmo.
		
		Scanner LerCustos = new Scanner(System.in);
		Scanner LerImp = new Scanner(System.in);
		double CustoFab, CustoImp, CustoVeiculo, CustoDistribuidor = 300, ResultadoImp, ResultadoDistribuidor;
		
		System.out.println("Digite os custos do ve�culo:");
		CustoFab = LerCustos.nextDouble();
		
		CustoVeiculo = CustoFab + CustoDistribuidor * 300;
		
		ResultadoImp = CustoFab * 55/100;
		
		
		
		System.out.println("Valor total do ve�culo + impostos:\n" +ResultadoImp);
		
		
		ResultadoDistribuidor = CustoFab + ResultadoImp * 30/100; 

		System.out.println("Valor total do ve�culo + impostos + Imp Distribui��o:\n" +ResultadoDistribuidor);

		
		

	}

}
