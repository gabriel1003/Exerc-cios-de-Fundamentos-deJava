package Fundamentos.exerciciosConversao;

import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A equação ax² + b + c = 0. ");
        System.out.println("\nDigite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("\nDigite o valor de B: ");
        int b = sc.nextInt();

        System.out.println("\nDigite o valor de C: ");
        int c = sc.nextInt();

        int delta = (b * b) - (4 * a * c);

        System.out.printf("O resultado da equação é: %dx² + %dx + %d = 0" ,a ,b ,c);
        System.out.println("O delta é: " +delta);

        double x1 = (-2 + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da sua equação é: %.2f." ,x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("O x2 da sua equação é: %.2f." ,x2);
        sc.close();
    }
}
