import java.util.Scanner;
public class teste1 {
	//Este programa chama uma exce��o quando um numero impar � adicionado ao array
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
			int[] valores= new int[5];// cria��o do arraycom a defini��o do tamanho do array
			Scanner entrada = new Scanner(System.in); // cria��o da classe scanner
			System.out.println("ArrayValores [5]\n"); //mensagem de comando para o usu�rio
			for(int linha = 0 ; linha < 5 ; linha++)
				{
					System.out.printf("Insira o elemento Valores [%d]: ", linha+1);
					int teste = entrada.nextInt(); 
					if (teste%2!=0)
					{
						MyException me = new MyException("Este vetor s� aceita valores pares");
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
	