package classes.desafiomodulo;

import java.util.Scanner;

public class ImprimirDecrescido {
    static void imprimaDecrescido(int numero) {
        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que será decrscido: ");
        int numeroDecrescido = sc.nextInt();
        imprimaDecrescido(numeroDecrescido);
        sc.close();
    }
}
