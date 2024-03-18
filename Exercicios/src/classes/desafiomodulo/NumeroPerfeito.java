package classes.desafiomodulo;

import java.util.Scanner;

public class NumeroPerfeito {
    public static boolean ehPerfeito(int num) {
        if (num <= 1) {
            return false;
        }
        int somaDivisores = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                somaDivisores += i;
                somaDivisores += num / i;
            }
        }
        return somaDivisores == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e descubra, se ele é perfeito ou não: ");
        int numero = sc.nextInt();
        if (ehPerfeito(numero)) {
            System.out.printf("O número %d é perfeito. " ,numero);
        } else {
            System.out.printf("O número %d não é perfeito. " ,numero);
        }
        sc.close();
    }
}
