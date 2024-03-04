package controle.Exercicios.Controle;

import java.util.Scanner;

public class DescubraQualEOMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int maiorValor = 0;
        int contador = 0;
        do {
            System.out.println("Digite um valor. ");
            valor = sc.nextInt();
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            contador++;
        } while (contador != 10);
        System.out.printf("Você digitou ao todo %d números e o maior número digitado foi %d" ,contador ,maiorValor);
        sc.close();
    }
}
