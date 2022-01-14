import java.util.Scanner;

public class ExercicioNapoleao7 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um lado do triangulo:");
		int ladoA = scan.nextInt();
		System.out.println("Diga um lado do triangulo:");
		int ladoB = scan.nextInt();
		System.out.println("Diga um lado do triangulo:");
		int ladoC = scan.nextInt();
		
		if ( ladoA >= 1 && ladoB > 0 && ladoC > 0) {
			System.out.println("Formou um triangulo!");
		} else {
			System.out.println("Não pode triangulo");
		}
	}

}
