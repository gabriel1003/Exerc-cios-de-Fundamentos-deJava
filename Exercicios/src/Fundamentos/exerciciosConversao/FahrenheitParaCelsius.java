package Fundamentos.exerciciosConversao;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a temperatura em fahrenheit? ");
        double fahrenheit = sc.nextDouble();

        final double conversao = (fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é: %.2f." ,conversao);
        sc.close();
    }
}
