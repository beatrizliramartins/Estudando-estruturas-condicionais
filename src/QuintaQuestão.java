import java.util.Scanner;

public class QuintaQuest�o {

	public static void main(String[] args) {
		//Ler uma temperatura em graus Celsius e apresent� la 
		//convertida em graus Fahrenheit. A f�rmula de convers�o �:
		//F=(9*C+160) / 5
			//	sendo F
		
		Scanner LerTemp = new Scanner(System.in);
		
		double C, F;
		
		System.out.println("Digite a quantidade que deseja converter:");
		C = LerTemp.nextDouble();
		
		F = (9*C + 160) / 5;
		
		System.out.println(C+"Os graus s�o equivalentes a:"+F);
				
	}

}
