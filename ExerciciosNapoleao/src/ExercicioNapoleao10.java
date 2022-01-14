import java.util.Scanner;

public class ExercicioNapoleao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um numero");
		int numA = scan.nextInt();
		System.out.println("Diga um numero");
		int numB = scan.nextInt();
		System.out.println("Diga um numero");
		int numC = scan.nextInt();
		
		if ( numA > numB && numA > numC ) {
			System.out.println("Numero maior é: " + numA);
		} if ( numB > numA && numB > numC) {
			System.out.println("Numero maior é: " + numB);
		} if ( numC > numA && numC > numB) {
			System.out.println("Numero maior é: " + numC);
		}
		
		if ( numA < numB && numA < numC ) {
			System.out.println("Numero menor é: " + numA);
		} if ( numB < numA && numB < numC) {
			System.out.println("Numero menor é: " + numB);
		} if ( numC < numA && numC < numB) {
			System.out.println("Numero menor é: " + numC);
		}
	}
}
