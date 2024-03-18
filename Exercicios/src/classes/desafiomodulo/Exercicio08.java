package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio08 {
    static void inverrteValorVariavel(int a, int b) {
        int reserva = a;
        a = b;
        b = reserva;
        System.out.printf("\nAgora o valor da sua primeira variável é: %d" ,a);
        System.out.printf("\nAgora o valor da sua segunda variável é: %d" ,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua primeira variável: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o valor da sua segunda variável: ");
        int valor2 = sc.nextInt();
        inverrteValorVariavel(valor1, valor2);
        sc.close();
    }
}
