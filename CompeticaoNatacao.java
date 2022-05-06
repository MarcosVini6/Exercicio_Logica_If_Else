package lutas.gloriacondicionaisifelse;
import java.util.Scanner;

public class CompeticaoNatacao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		System.out.println("Digite o nome do participante:");
		String nome = leia.next();
		System.out.println("Digite a idade do participante:");
        int idade = leia.nextInt();

        if (idade<10) {
			System.out.println(nome + " categoria infantil");	
		}else if (idade>10 && idade<=15) {
			System.out.println(nome + " categoria juvenil");
		}else if (idade>15 && idade<=19) {
			System.out.println(nome + " categoria semi adulto");
		}else {
			System.out.println(nome + " categoria adulto");
		}
	}

}
