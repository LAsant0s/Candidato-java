import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1) leitura da escolaridade
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		
		System.out.print("Digite uma op��o: ");
		int escolaridade = sc.nextInt();
		System.out.println();
		
		//3) leitura dos outros dados
		System.out.print("Voc� tem quantos anos de experi�ncia profissional? ");
		int xpProfissional = sc.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)? ");
		char disp = sc.next().charAt(0); 
		System.out.print("Voc� tem habilita��o de motorista (S/N)? ");
		char habilitacao = sc.next().charAt(0); 
		
		
		
	}

}
