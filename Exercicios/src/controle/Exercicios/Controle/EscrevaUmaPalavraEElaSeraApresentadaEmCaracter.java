package controle.Exercicios.Controle;

import java.util.Scanner;

public class EscrevaUmaPalavraEElaSeraApresentadaEmCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a palavra desejada. ");
        String palavra = sc.nextLine();
        char letras[] = palavra.toCharArray();
        for (int i = 0; i< letras.length; i++) {
            System.out.println(letras[i]);
        }
        sc.close();
    }
}
