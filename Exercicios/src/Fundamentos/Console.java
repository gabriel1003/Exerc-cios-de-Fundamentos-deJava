package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu nsobrenome: ");
        String sobreNome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.printf("O seu nome e sobrenome é:  %s %n %s %na sua idade é %n %d anos." ,nome ,sobreNome ,idade);
        sc.close();
    }
}
