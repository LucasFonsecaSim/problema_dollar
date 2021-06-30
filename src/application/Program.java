package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		/* / Instância a classe Conversor. / */
		Conversor conv=new Conversor();
		
		/* / Preço do dollar. / */
		System.out.print("What is the dollar price? ");
		Conversor.dollar=sc.nextDouble();
		
		/* / Quantidade de dollar comprado, e ja convertendo com a taxa de 6%. / */
		System.out.print("How many dollars will be bought? ");
		Conversor.quantidade=sc.nextDouble();
		
		/* / Chamando a função toString. / */
		System.out.print(conv);
		

	sc.close();
	}

}
