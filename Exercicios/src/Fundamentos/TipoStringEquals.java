package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2"); //Esta é uma forma de comparar strings porem não é a melhor.

        String s1 = new String("2");
        System.out.println("2" == s1); //neste caso ele não faz a comparação pois aqui está sendo avaliado o tipo e não o conteudo.
        System.out.println("2".equals(s1)); //Neste caso será avaliado o conteudo.

        Scanner sc = new Scanner(System.in);
        String s2 = sc.next();

        System.out.println("2" == s2);
        System.out.println("2".equals(s2));
        sc.close();
    }
}
