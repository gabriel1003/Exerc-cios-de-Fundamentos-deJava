package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os últimos três salários para descobrir qual é a sua média. ");

        System.out.println("Digite o primeiro valor: ");
        String salario1 = sc.nextLine().replace(",", ".");
        System.out.println("Digite o segundo valor: ");
        String salario2 = sc.nextLine().replace(",", ".");
        System.out.println("Digite o seu útimo valor: ");
        String salario3 = sc.nextLine().replace(",", ".");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3= Double.parseDouble(salario3);
        double media = valor1 + valor2 + valor3;

        System.out.printf("A sua média salarial é de %.2f. " ,media/3);
        sc.close();
    }
}
