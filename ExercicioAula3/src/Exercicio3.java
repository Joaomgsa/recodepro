import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		int numero,resultado,i;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o número que deseja fazer a tabuada");
		numero =sc.nextInt();
		sc.close();
		for (i=0; i<=10; i++) {
			resultado = (numero* i);
			System.out.println(numero + "X" + i + "=" +resultado);
		}

	}

}
