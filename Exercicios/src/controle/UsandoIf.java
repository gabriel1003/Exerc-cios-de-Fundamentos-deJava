package controle;

import java.util.Scanner;

public class UsandoIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média e descubra se passou ou não. ");
        float media = sc.nextFloat();
        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado! ");
        }
        if (media <= 7 && media >= 4) {
            System.out.println("Em recuperação. ");
        }
boolean criterioReprovacaoAtingido = media < 4.0 && media >= 0;
        if (criterioReprovacaoAtingido) {
            System.out.println("Você foi reprovado. ");
        }
        sc.close();
    }
}
