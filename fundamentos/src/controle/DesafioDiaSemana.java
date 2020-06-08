package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		//Domingo -> 1
		//quarta  -> 4
		//ter�a   -> 3
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do dia: ");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if("ter�a".equalsIgnoreCase(dia)||
				"terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}else if("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}else if("s�bado".equalsIgnoreCase(dia)||
				"sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}else {
			System.out.println("N�o � um dia da semana!");
		}
		
		entrada.close();
	}
}
