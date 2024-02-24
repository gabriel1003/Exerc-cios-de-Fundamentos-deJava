package Fundamentos.exerciciosConversao;

import java.util.Scanner;

public class ValorAoQuadradoEAoCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double valor = sc.nextDouble();
        double aoQuadrado = Math.pow(valor, 2);
        double aoCubo = Math.pow(valor, 3);

        System.out.printf("O valor ao Quadrado é: %.2f. O valor ao cubo é: %.2f." ,aoQuadrado ,aoCubo);
        sc.close();
    }
}
