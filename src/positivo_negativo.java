import java.util.Scanner;
public class positivo_negativo {

	public static void main(String[] args) {
		System.out.println("----- Programa Positivo ou negativo-----");
		int numero = 0;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira um número:");
		numero = leitura.nextInt();
		
		if(numero >0)
			System.out.println("Número é positivo");
		else if(numero <0)
			System.out.println("Número é negativo");
		else if(numero ==0) {
			System.out.println("O número é neutro");
		}
		
		
		
		

	}

}
