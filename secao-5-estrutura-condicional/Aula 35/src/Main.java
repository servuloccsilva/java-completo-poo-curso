import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
////		Aula 35 
//		Scanner sc = new Scanner(System.in);
//		int hora;
//		
//		System.out.println("Qual a hora?");
//		hora = sc.nextInt();
//		
//		if (hora < 12) {
//			System.out.println("Bom dia");
//		} else if (hora < 18) {
//			System.out.println("Boa tarde");
//		} else {
//			System.out.println("Boa noite");
//		}
//		
//		sc.close()

////		Aula 38
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int minutos = sc.nextInt();
//		
//		double conta = 50.0;
//		
//		if (minutos > 100) {
//			conta += (minutos - 100) * 2.0;
//		}
//		System.out.printf("O valor da conta é R$ %.2f%n", conta);
//		sc.close();
		
//		Aula 39 - switch-case
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
				
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
		
		

	}

}
