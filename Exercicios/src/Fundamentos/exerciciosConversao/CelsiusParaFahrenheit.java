package Fundamentos.exerciciosConversao;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius. ");
        float celsius = sc.nextFloat();
        final double conversao = celsius * 1.8 + 32;

        System.out.println("A temperatura em fahrenheit é: " +conversao);
    }
}
