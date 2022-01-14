import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um número que seja o A");
		int numeroA = scan.nextInt();
		System.out.println("Diga um número que seja o B");
		int numeroB = scan.nextInt();
		System.out.println("Diga um número que seja o C");
		int numeroC = scan.nextInt();
		
		if ( (numeroA < numeroB && numeroB < numeroC) || (numeroA > numeroB && numeroB > numeroC)){
			System.out.println("Número Ordenados!");
		}  else {
			System.out.println("Fora");
		}
	}

}
