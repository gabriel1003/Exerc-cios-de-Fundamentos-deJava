package controle;

import java.util.Scanner;

public class DuWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Você precisa falar: "
                    + "\nnas palavras mágicas..");
            System.out.println("Você quer sair? ");
            texto = sc.nextLine();
        } while (!texto.equalsIgnoreCase("Purfavor"));
        System.out.println("Obrigado. ");
        sc.close();
    }
}
