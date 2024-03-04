package controle;

import java.util.Scanner;

public class DesafioIfEelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana e descubra, qual é o seu referido número. ");
        String diaSemana = sc.next();

        if ("Segunda".equals(diaSemana)) {
            System.out.println("O número é 2.");
        } else if ("Terça".equals(diaSemana)) {
            System.out.println("o seu número é 3.");
        } else if ("Quarta".equals(diaSemana)) {
            System.out.println("O seu númeroé 4 ");
        } else if ("Quinta".equals(diaSemana)) {
            System.out.println("O seu número é 5");
        } else if ("Sexta".equals(diaSemana)) {
            System.out.println("O seu número é 6. ");
        } else if ("Sábado".equals(diaSemana)) {
            System.out.println("O seu número é 7.");
        } else if ("Domingo".equals(diaSemana)) {
            System.out.println("Oseu número é 1. ");
        }
        else {
            System.out.println("Digite um dia válido. ");
        }
        sc.close();
    }
}
