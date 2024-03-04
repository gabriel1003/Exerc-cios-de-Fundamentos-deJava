package controle.Exercicios.Controle;

import java.util.Scanner;

public class DescobrindoSeONumeroEPar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10 é descubra se ele é ímpar ou par. ");
        int numero = sc.nextInt();

        if (numero > 0 && numero <=10) {
            if (numero % 2 == 0) {
                System.out.println("O número " + numero + "é válido é é um par. ");
            } else {
                System.out.println("O número " + numero + "é válido mas não é par. ");
            }
        } else {
                System.out.println("Digite um numero válido. ");
            }
        sc.close();
    }
}
