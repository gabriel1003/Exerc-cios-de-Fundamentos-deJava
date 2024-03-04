package controle.Exercicios.Controle;

import java.util.Scanner;

public class UsandoSwitchParaDescobrirOsNumsPrimos {
    public static void main(String[] args) {

        int contadorDeDivisao = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e descubra se é primo. ");
        int numero = sc.nextInt();
        for (int i = 2; i < numero; i++) {
            if (numero% i == 0) {
                contadorDeDivisao ++;
            }
        }
        switch (contadorDeDivisao) {
            case 0:
                System.out.printf("O número %d é primo. " ,numero);
                break;
            default:
                System.out.printf("O número %d não é primo. " ,numero);
        }
        sc.close();
    }
}
