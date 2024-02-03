import java.util.Scanner;
import java.util.Random;

public class Vetores {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random rand  = new Random();
        double notas;double quantidades;
        System.out.println("Digite com quantas notas deseja caucular a nota ?");
        int quant = scan.nextInt();
        int[] numeros = new int[quant];



        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(50);
            System.out.print((i+1)+"A nota do aluno " + numeros[i]);
        }
    }
}
