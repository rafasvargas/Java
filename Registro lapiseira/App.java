package questao5;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
	static Scanner imput = new Scanner(System.in);	
	static ArrayList<Lapiseira> str = new ArrayList<Lapiseira>();
	public static void main (String [] args) {
		try {
			while (true) {
				System.out.println("Escolha uma opção");
				System.out.println("0 - sair    1 - cadastrar");
				int opcao = imput.nextInt();
				switch (opcao) {
				case 0:
					for(int i = 0; i < str.size(); i++){
						Lapiseira lapiseira = str.get(i);
						System.out.println("Marca: "+lapiseira.getMarca());
						System.out.println("Cor: "+lapiseira.getCor());
						System.out.println("Grafite: "+lapiseira.getGrafite());					}
					return;
				case 1:
					cadastrar();
				}
			}		
		}finally {
			imput.close();
		}
	}
	
	public static void cadastrar() {
		
		System.out.println("Qual a marca da lapiseira? ");
		String marca = imput.next();
		System.out.println("Qual a cor da lapiseira? ");
		String cor = imput.next();
		System.out.println("Qual o grafite da lapiseira? ");
		float grafite = imput.nextFloat();
		Lapiseira nova = new Lapiseira(marca, cor,(float) grafite);
		str.add(nova);
		
	}
}
