package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio03 {
    static int n1 = 0, n2 = 1, n3 = 0;
    static void imprimaFibonacci(int contador) {
         if (contador > 0) {
             n3 = n1 + n2;
             n1 = n2;
             n2 = n3;
             System.out.println(" " +n3);
             imprimaFibonacci(contador - 1);
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para o contador: ");
        int contador = sc.nextInt();
        System.out.println(n1 +" " +n2);
        imprimaFibonacci(contador - 2);
        sc.close();
    }
}
