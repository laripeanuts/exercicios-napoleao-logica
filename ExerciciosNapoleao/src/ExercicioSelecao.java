import java.util.Scanner;

public class ExercicioSelecao {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroRecebido = scan.nextInt();
		if (numeroRecebido % 2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�o � par");
		}
	}
}
