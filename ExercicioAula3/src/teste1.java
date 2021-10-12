import java.util.Scanner;
public class teste1 {
	//Este programa chama uma exceção quando um numero impar é adicionado ao array
	class MyException extends Exception
	{
		//Default constructor
		MyException() {   }
		
		//Parametrized Constructor 
		MyException(String str) { super(str);}
	
		
	//main
	public static void main(String[] args) 
	{
		try {
			int[] valores= new int[5];// criação do arraycom a definição do tamanho do array
			Scanner entrada = new Scanner(System.in); // criação da classe scanner
			System.out.println("ArrayValores [5]\n"); //mensagem de comando para o usuário
			for(int linha = 0 ; linha < 5 ; linha++)
				{
					System.out.printf("Insira o elemento Valores [%d]: ", linha+1);
					int teste = entrada.nextInt(); 
					if (teste%2!=0)
					{
						MyException me = new MyException("Este vetor só aceita valores pares");
						throw me;
					}
				
				}
				entrada.close();
		   	} //end of try

		catch(MyException e)
		{
			e.printStackTrace();
		}
		
	}

}
}
	