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
			System.out.println("Numero maior �: " + numA);
		} if ( numB > numA && numB > numC) {
			System.out.println("Numero maior �: " + numB);
		} if ( numC > numA && numC > numB) {
			System.out.println("Numero maior �: " + numC);
		}
		
		if ( numA < numB && numA < numC ) {
			System.out.println("Numero menor �: " + numA);
		} if ( numB < numA && numB < numC) {
			System.out.println("Numero menor �: " + numB);
		} if ( numC < numA && numC < numB) {
			System.out.println("Numero menor �: " + numC);
		}
	}
}
