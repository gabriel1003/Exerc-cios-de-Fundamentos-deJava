package Fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; //é o mesmo que a + 1.
        a--; //é o mesmo que a - 1.
        ++b; //é o mesmo que b + 1 só que neste caso só mudou, a ordem do operando e operador.
        --b;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio: ");
        System.out.println(++a == b--); //neste caso o resultado seria true pelo fato da precedencia ou seja, ele faz o incremento antes da comparação.
        System.out.println(a == b); //aqui o resultado é false pois, ele primeiro compara e depois faz o incremento.
        System.out.println(a);
        System.out.println(b);
    }
}
