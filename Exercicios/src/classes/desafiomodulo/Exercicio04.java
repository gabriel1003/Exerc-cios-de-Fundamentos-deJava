package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio04 {
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = 2; i <= numero; i++) {
            if (ehPrimo(i))
                System.out.println(i +" é primo. ");
        }
        sc.close();
    }
}
