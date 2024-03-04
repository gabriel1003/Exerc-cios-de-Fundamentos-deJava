package controle.Exercicios.Controle;

import java.util.Scanner;

public class DescubraSeOnumeroePrimo {
    public static void main(String[] args) {
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para descobrir se ele é primo ou não. ");
        int numero = sc.nextInt();
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contador ++;
            }
        }
        if (contador == 0) {
            System.out.printf("O número %d é primo. " ,numero);
        } else {
            System.out.printf("O número %d não é primo. " ,numero);
        }
        sc.close();
    }
}
