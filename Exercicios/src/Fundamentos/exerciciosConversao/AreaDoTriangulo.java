package Fundamentos.exerciciosConversao;

import java.util.Scanner;

public class AreaDoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a base do triângulo? ");
        float base = sc.nextFloat();
        System.out.println("Qual é a altura? ");
        float altura = sc.nextFloat();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é: %.2f." ,area);
        sc.close();
    }
}
