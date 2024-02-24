package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {
//        Trabalhando com inferências.
        var a = 5.0; //aqui atribuimos um tipo à variavel dando a ela um valor.

        System.out.println(a);
        a = 6; //como já haviamos dado um valor flutuante na declaração, altomaticamente ela se tornou um double e não importa o valor numérico que atribuirmos a variavel, o interpretador converterá a resposta em um double.

        System.out.println(a);

        var b = "eu sou um valor string";
    System.out.println(b);

    b = "como sou string só recebo strings";
    System.out.println(b);
    }
}
