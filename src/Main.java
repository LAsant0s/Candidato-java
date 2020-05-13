import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1) leitura da escolaridade
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");

		System.out.print("Digite uma op��o: ");
		int escolaridade = sc.nextInt();
		System.out.println();

		// 2) leitura dos outros dados
		System.out.print("Voc� tem quantos anos de experi�ncia profissional? ");
		int xpProfissional = sc.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)? ");
		char disp = sc.next().charAt(0);
		System.out.print("Voc� tem habilita��o de motorista (S/N)? ");
		char habilitacao = sc.next().charAt(0);
		System.out.println("");

		// 3) escolaridade e experiencia
		int pontosEscolaridade = 0;

		switch (escolaridade) {
		case 1:
			pontosEscolaridade = 10;
			break;

		case 2:
			pontosEscolaridade = 20;
			break;

		case 3:
			pontosEscolaridade = 30;
			break;

		case 4:
			pontosEscolaridade = 40;
			break;
		}

		int pontosExperiencia;

		if (xpProfissional == 0) {
			pontosExperiencia = 0;
		} else if (xpProfissional <= 2) {
			pontosExperiencia = 10;
		} else if (xpProfissional <= 5) {
			pontosExperiencia = 20;
		} else {
			pontosExperiencia = 40;
		}
		System.out.println("Pontos por escolaridade: " + pontosEscolaridade);
		System.out.println("Pontos por experi�ncia: " + pontosExperiencia);
		System.out.println("");

		// Resultado final
		if (pontosEscolaridade < 20) {
			System.out.println("Infelizmente seu perfil n�o atende a empresa");
		} else {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargos(s):");
		}
		if (pontosEscolaridade >= 20 && habilitacao == 'S') {
			System.out.println("ASSISTENTE");
		}
		if (pontosExperiencia > 10 && pontosEscolaridade >= 30) {
			System.out.println("GERENTE");
		}
		if (pontosExperiencia > 20 && disp == 'S' && pontosEscolaridade >= 30) {
			System.out.println("ANALISTA");
		}

	}

}
