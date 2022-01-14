import java.util.Scanner;

public class ExercicioSelecao2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroDito = scan.nextInt();
		if (numeroDito > 0) {
			System.out.println("Numero posito");
		} else if (numeroDito < 0) {
			System.out.println("Numero negativo");
		} else {
			System.out.println("Zerou");
		}
	}
}
