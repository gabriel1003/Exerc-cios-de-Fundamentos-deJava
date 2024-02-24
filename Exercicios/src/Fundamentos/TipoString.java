package Fundamentos;


import java.util.Locale;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Olá pessoal tudo bem? ".charAt(9)); // o charAt serve para encontrar o o índice na frase.
String s = "Boa tarde";
                System.out.println(s.concat("!!!")); //Como já visto anteriormente é para concatenar uma string.
        System.out.println(s.startsWith("Boa")); //serve para ver se a palavra está na fraze.
        System.out.println(s.toLowerCase()); //serve para por a frase toda ou palavra em ninúsculo.
        System.out.println(s.toLowerCase().startsWith("boa")); //serve para pegar a primeira frase da linha e devolve um booleano.
        System.out.println(s.toUpperCase().endsWith("tarde")); //o endWith serve para pegar a frase no final da linha e o toUpperCase para torna-la toda em maiúscula.
         System.out.println(s.length()); //serve para ver a quantidade de caracteres da frase.
    System.out.println(s.toLowerCase().equals("boa tarde")); //serve tambem para comparar e ver se a palavra existe na frase.
        System.out.println(s.equalsIgnoreCase("BOA TARDE"));

        var nome = "Pedro"; //Aqui estamos usando a inferência.
        var sobreNome = "Santos";
        var idade = 25;
        var salario = 12345.98F;

        String maisUmaFrase = "nome" +nome +"\nSobrenome" +sobreNome
                +"\nIdade" +idade +"\nGanha de salário" +salario +"\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d de idade e ganha R$%.2f." ,nome
        ,sobreNome ,idade ,salario); //Está é uma forma de concatenar e formatar usando o printf.
    }
}
