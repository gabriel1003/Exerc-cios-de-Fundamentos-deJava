package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio11 {
    static void dataValida(int dia, int mes, int ano) {
        if (dia >= 01 && mes >= 01 && ano >= 01) {
            System.out.printf("A data atual é %d / %d / %d" ,dia ,mes ,ano);
        } else {
            System.out.println("Digite uma data válida. ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia de hoje: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.println("Ano: ");
        int ano = sc.nextInt();
        dataValida(dia, mes, ano);
        sc.close();
    }
}
