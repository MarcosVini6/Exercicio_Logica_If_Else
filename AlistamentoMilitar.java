package lutas.gloriacondicionaisifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
         public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite o sexo masculino (M) ou feminino(F):" );
			String sexo = leia.next();
			System.out.println("Digite a idade: ");
			int idade = leia.nextInt();
			
			 if (sexo.equalsIgnoreCase("M") && idade>=18) {
				 System.out.println("Alistamento obrigatorio");
				
			}else if (sexo.equalsIgnoreCase("F") && idade>=18) {
				 System.out.println("Deseja se alistar");
			}else {
   				 System.out.println("Alistamento não permitido");
			}
		}
}
