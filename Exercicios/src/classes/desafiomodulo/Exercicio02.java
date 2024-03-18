package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio02 {
    static int maiorNumero;
    static void numeroMaior(int a, int b, int c) {
        if (a > b && a > c) {
            maiorNumero = a;
        } else if (b > a && b > c) {
            maiorNumero = b;
        } else {
            maiorNumero = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número para descobrir qual é o maior. ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número. ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número. ");
        int n3 = sc.nextInt();
        numeroMaior(n1, n2, n3);
        System.out.println("O maior número digitado foi: " +maiorNumero);
        sc.close();
    }
}
