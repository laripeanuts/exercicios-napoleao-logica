import java.util.Scanner;

public class ExercicioNapoleao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um numero de 4 digitos:");
		int numero = scan.nextInt();
		
		int primeiraParte = numero / 100;
		int segundaParte = numero % 100;
		int somaNumeros = primeiraParte + segundaParte;
		int numeroPotencia = (int) Math.pow(somaNumeros, 2);
		
		if ( numeroPotencia == numero) {
			System.out.println("Este numero se enquadra!");
		} else {
			System.out.println("Nao serve");
		}

	}

}
