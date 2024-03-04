package controle.Exercicios.Controle;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tentativas;
        int continuar;
        int numero;
        int numeroSorteado;

        do {
            System.out.println("Sorteando um número entre 1 e 100. ");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);
            System.out.println("Começou o jogo, será que consegue vencer? ");
            tentativas = 0;
            do {
tentativas++;
System.out.printf("Tentativas %d: " ,tentativas);
numero = sc.nextInt();
if (numero > numeroSorteado) {
    System.out.printf("\nO número sorteado é menor que %d. " ,numero);
} else if (numero < numeroSorteado) {
    System.out.printf("\nO número %d é menor que o numero sorteado. " ,numero);
} else {
    System.out.printf("\nParabéns você acertou o número sorteado e o número de tentativas foi %d " ,tentativas);
    break;
}
            } while (tentativas != 10);
            System.out.println("Digite 0 para sair ou qualquer outro número para continuar. ");
            continuar = sc.nextInt();
        } while (continuar != 0);
        sc.close();
    }
}
