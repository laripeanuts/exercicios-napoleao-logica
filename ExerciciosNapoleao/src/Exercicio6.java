import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um n�mero que seja o A");
		int numeroA = scan.nextInt();
		System.out.println("Diga um n�mero que seja o B");
		int numeroB = scan.nextInt();
		System.out.println("Diga um n�mero que seja o C");
		int numeroC = scan.nextInt();
		
		if ( (numeroA < numeroB && numeroB < numeroC) || (numeroA > numeroB && numeroB > numeroC)){
			System.out.println("N�mero Ordenados!");
		}  else {
			System.out.println("Fora");
		}
	}

}
