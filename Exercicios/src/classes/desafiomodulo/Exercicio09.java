package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio09 {
    static void comparaValores(int a, int b) {
        if (a == b) {
            System.out.println("Os dois valores digitados, são iguais. ");
        } else {
            System.out.println("Os valores digitados não são iguais. ");
        }
        if (a > b) {
            System.out.printf("Onúmero %d é maior que %d. " ,a ,b);
        } else {
            System.out.printf("O maior número é %d e o menor é %d. " ,b ,a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número. ");
        int valor1 = sc.nextInt();
        System.out.println("Digite outro valor. ");
        int valor2 = sc.nextInt();
        comparaValores(valor1, valor2);
        sc.close();
    }
}
