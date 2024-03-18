package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio06 {
    static void imprimaNumeroDecrescente(int numero) {
        int lista;
        for (int i =0; i <= numero; i++) {
            lista = numero - i;
            System.out.println(lista);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que será decrescido: ");
        int decrescido = sc.nextInt();
imprimaNumeroDecrescente(decrescido);
sc.close();
    }
}
