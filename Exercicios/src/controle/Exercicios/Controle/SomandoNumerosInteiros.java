package controle.Exercicios.Controle;

import java.util.Scanner;

public class SomandoNumerosInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somadorDeNumeros = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.println("Digite um número inteiro (ou negativo para sair). ");
            numero = sc.nextInt();
            if (numero >= 0) {
                somadorDeNumeros += numero;
                System.out.printf("Somou até agora: %d " ,somadorDeNumeros);
            }
        }
        sc.close();
    }
}
