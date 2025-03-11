import java.util.Scanner;


public class soma {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Primeiro Numero:");
		double primeiroNumero = sc.nextDouble();

		System.out.println("Digite o Segundo Numero:");
		double segundoNumero = sc.nextDouble();

		 double resultadoSoma = (primeiroNumero + segundoNumero);

		 System.out.println("---------------------------------");
		 System.out.println("Resultado:");

		System.out.println(resultadoSoma);

	}
}