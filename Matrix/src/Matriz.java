public class Matriz {
    public static void main(String[] args)  {
        int [] [] matriz2 = {{4,5,8,2},{8,5,4,2},{1,3,5,7}};

        for(int  i=0 ;i<matriz2.length ;i++) {
            System.out.println();
            for (int j = 0; j < matriz2[i].length; j++)
                System.out.print(matriz2[i][j] +  "\t");
        }
        System.out.println("\n");
        double a = 10.16546, b  = 20.69875;
        System.out.printf("Imprimir %.2f  - %.2f\n",a,b);
    }
}

