package lutas.gloriacondicionaisifelse;
import java.util.Scanner;

public class ImparOuPar {	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			int Numero1 = leia.nextInt();
			if (Numero1%2==0) {
				System.out.println("O numero é par");
				
			}else {
				System.out.println("O numero é impar");
			}
		}

}
