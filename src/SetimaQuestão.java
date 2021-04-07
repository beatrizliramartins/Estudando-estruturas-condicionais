import java.util.Scanner;

import javax.swing.JOptionPane;

public class SetimaQuestão {

	public static void main(String[] args) {
		
		Scanner RecebeIdade = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		if(idade <= 7) {
			System.out.println("Você faz parte do grupo infantil A");
		}
		if((idade >= 8) && (idade >= 10)) { 
			System.out.println("Você faz parte do grupo infantil B");
		}
		if((idade >=11) && (idade >= 13)) { 
			System.out.println("Você faz parte do grupo Juvenil A");
		}
		if((idade >=14) && (idade >= 17)) { 
			System.out.println("Você faz parte do grupo Juvenil B");
		}
		if((idade >=18) && (idade >= 25)) { 
			System.out.println("Você faz parte do grupo Sênior");
		}
			
	else 
		System.out.println("Você está fora da faiza etária");
}
}
