package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio01 {
    static void somatorio(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
       int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        somatorio(num1, num2);
        sc.close();
    }
}
