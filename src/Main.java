import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1) leitura da escolaridade
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		
		System.out.print("Digite uma opção: ");
		int escolaridade = sc.nextInt();
		System.out.println();
		
		//3) leitura dos outros dados
		System.out.print("Você tem quantos anos de experiência profissional? ");
		int xpProfissional = sc.nextInt();
		System.out.print("Você tem disponibilidade para viajar (S/N)? ");
		char disp = sc.next().charAt(0); 
		System.out.print("Você tem habilitação de motorista (S/N)? ");
		char habilitacao = sc.next().charAt(0); 
		
		
		
	}

}
