import java.util.Scanner;

public class ExercicioNapoleao9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um numero");
		double numA = scan.nextDouble();
		System.out.println("Diga um numero");
		double numB = scan.nextDouble();
		System.out.println("Diga um numero");
		double numC = scan.nextDouble();
		System.out.println("Diga um numero");
		double numD = scan.nextDouble();
		
		double media = (numA + numB + numC + numD) / 4;
		
		System.out.println("A media entre os numeros é: " + media );	
		
		System.out.print("Numero maior que a media: ");
		if ( numA > media ) {
			System.out.print(numA + " ");	
		}
		if ( numB > media ) {
			System.out.print(numB + " ");	
		}
		if ( numC > media ) {
			System.out.print(numC + " ");	
		}
		if ( numD > media ) {
			System.out.print(numD + " ");
		}
		
	}
}
