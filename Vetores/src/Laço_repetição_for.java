import java.util.Scanner; // --> ultilicado sempre que o usuario for entrar com variavei de numeros 
public class Laço_repetição_for {

	public static void main(String[] args) {
		Scanner criarnumero = new Scanner(System.in); // ele e usado e obrigatorio para quando o usuario for entrar com algum valor. 
		int maior=0, numero ; // --> variaveis criadas para verificassao do maior numero digitado pelo usuario.
	
		for (int i=0; i<5; i++) // --> for usado para o usuario conceguir digitar os 5 numero e depois fazer a verificassao do maior numero 
		{
			System.out.println("digite um numero inteiro positivo: ");
			numero = criarnumero.nextInt(); // --> se o numero digitado pelo usuario for maior que ira reserva na variavel numero depois ira passar pelo if para verificar o maior
		
		
			if (numero < 0) // --> passando por verificao se o numero e negativo
		{
			System.out.println("numero invalido nao computado!!"); // --> caso se for negativo
		    i--; // para verificar se o numero e negativo
		}
		
		
			else if (numero >  maior) // se numero for maior que a variavel maior 
		{
			maior = numero;   // --> maior ira receber o o numero maior 
		}		
	   
	}
	 System.out.println("o maior numero digitado foi:"+ maior); // --> e aqui imprimira o numero maior que ela recebei do numero digitado pelo usuario 

}

}
