import java.util.Scanner;

public class ExexercicioNapoelao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me diga um num");
		int numeroA = scan.nextInt();
		System.out.println("Me diga mais um num");
		int numeroB = scan.nextInt();
		
		if ( numeroA > numeroB ) {
			System.out.println("Maior numero � " + numeroA);
		} else {
			System.out.println("Maior numero � " + numeroB);
		}
	
	scan.close();			
		
	}

}