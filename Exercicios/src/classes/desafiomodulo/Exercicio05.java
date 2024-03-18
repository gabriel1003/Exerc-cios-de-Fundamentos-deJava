package classes.desafiomodulo;

import java.util.Scanner;

public class Exercicio05 {
    static void maisVelhaMaisNova(String nome1, int idade1, String nome2, int idade2, String nome3, int idade3) {
        if (idade1 > idade2 && idade1 > idade3) {
            System.out.printf("A pessoa mais velha é: %s" ,nome1);
        } else if (idade2 > idade1 && idade2 > idade3) {
            System.out.printf("A pessoa mais velha é: %s" ,nome2);
        } else {
            System.out.printf("A pessoa mais velha é: %s" ,nome3);
        }
        if (idade1 < idade2 && idade1 < idade3) {
            System.out.println("A pessoa mais nova é: " +nome1);
        } else if (idade2 < idade1 && idade2 < idade3) {
            System.out.println("A pessoa mais nova é: " +nome2);
        } else {
            System.out.println("A pessoa mais nova é: " +nome3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite tres nomes e tres idades, e descubra quem é a pessoa mais velha e a mais nova. \n Digite o primeiro nome");
        String nm1 = scanner.next();
        System.out.println("\nDigite a idade da primeira pessoa: ");
        int id1 = scanner.nextInt();
        System.out.println("\nDigite o segundo nome: ");
        String nm2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        int id2 = scanner.nextInt();
        System.out.println("Digite o nome da terceira pessoa: ");
        String nm3 = scanner.next();
        System.out.println("Digite a idade da terceira pessoa: ");
        int id3 = scanner.nextInt();
        maisVelhaMaisNova(nm1, id1, nm2, id2, nm3, id3);
        scanner.close();
    }
}
