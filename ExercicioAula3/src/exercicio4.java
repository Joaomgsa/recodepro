import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		int [][] matriz = new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Matriz Valores [2] x [3]");
		for (int i=0; i < 2; i++) 
		{
			for(int j=0; j<3; j++) {
				System.out.println("insira o elemento" +(i+1) + (j+1));
				matriz[i][j]=sc.nextInt();
			}
		}
		System.out.println("Digite o número que deseja encontrar");
		int numero = sc.nextInt();

	}

}
