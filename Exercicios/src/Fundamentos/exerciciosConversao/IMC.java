package Fundamentos.exerciciosConversao;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        double resultado = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f." ,resultado);
        sc.close();
    }
}
