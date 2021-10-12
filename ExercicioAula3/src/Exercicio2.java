import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		int igual =0;
		int [] vetor1= new int[5];//Criação do array com a definição do tamanho do array
		int [] vetor2= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("ArrayValores [5]\n");
		for (int linha=0; linha < 5; linha++){
			System.out.printf("Insira o elemento do primeiro vetor [%d]:", linha+1);
				vetor1[linha]=sc.nextInt();//entrada de dados na matriz
			}
		for (int linha=0; linha < 5; linha++){
			System.out.printf("Insira o elemento segundo vetor [%d]:", linha+1);
				vetor2[linha]=sc.nextInt();//entrada de dados na matriz
			}
		for (int i=0; i < 5; i++)
			{
				for(int j=0;j < 5; j++){
						if(vetor2[i]== vetor1[j]) 
							{	igual= igual+1;				
				}	
			}
		}
		System.out.println("Foram encontrados :" + igual + " Numeros duplicados");
	}
}
