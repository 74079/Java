import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) throws Exception {
        try (Scanner geradornumer = new Scanner(System.in)) {
            int maior = 0, numero;

            for(int i=0; i<5;i++){
                System.out.println("Digite um número positivo:");
                numero = geradornumer.nextInt();

                if (numero < 0){
                    System.out.println("Você digitou um valor negativo!");
                }else if (numero>maior) {
                    maior = numero;
                    }
            }
            System.out.println("\nO maior número foi: "+maior+".");
        }
    }
}
