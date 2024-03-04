package controle.Exercicios.Controle;

import java.util.Scanner;

public class DescubraAMediaDasNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); System.out.println("Digite as suas nótas e descubra a sua média. ");
        System.out.println("Descubra a sua média. \n Digite a sua primeira nota. ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a sua segunda nota. ");
        float nota2 = sc.nextFloat();
        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.printf("A sua média é: %.2f. e você foi aprovado. " ,media);
        } else if (media >= 4) {
            System.out.printf("A sua média foi: %.2f. e você está em recuperação. " ,media);
        } else {
            System.out.println("A sua média foi: " +media +" e você foi reprovado.");
        }
        sc.close();
    }

}
