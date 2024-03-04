package controle.Exercicios.Controle;

import java.util.Scanner;

public class DescubraSeOanoEBissexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos dias tem o ano e descubra se ele é bissexto ou não. ");
        int dia = sc.nextInt();
        if (dia == 366) {
            System.out.println("O ano é bissexto. ");
        } else if (dia == 365) {
            System.out.println("O ano não é bissexto. ");
        } else {
            System.out.println("Digite um número válido. ");
        }
        sc.close();
    }
}
