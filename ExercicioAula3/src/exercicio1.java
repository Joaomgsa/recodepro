import java.util.Scanner
public class exercicio1 {
	int[] valores= new int[5];// criação do arraycom a definição do tamanho do array
	Scanner entrada = new Scanner(System.in); // criação da classe scanner
	System.out.println("ArrayValores [5]\n");
	for(int linha=0 ; linha < 5 ; linha++){
	System.out.printf("Insira o elemento Valores [%d]: ", linha+1);
	int teste= entrada.nextInt(); 
	if (teste%2!=0) {
		System.out.println("Este vetor aceita somente numeros pares");
	}
	else {
		valores[linha]=teste;
	}
		
	// entrada de dados na matriz
	}
	System.out.println("\nOArrayficou: \n");
	for(int linha=0 ; linha < 5 ; linha++){
	System.out.printf("\t %d \t", valores[linha]);
	}
}
