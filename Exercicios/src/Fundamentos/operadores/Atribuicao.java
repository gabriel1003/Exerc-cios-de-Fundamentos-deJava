package Fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {

        float a = 3.5f;
         float b = a; float c = a + b;

c -= a;
c /= a;
c *= b;
c += b;

        System.out.println(c);

        c %= 2; //quando usamos o sinal de % é para descobrirmos resto de uma divisão.
        System.out.println(c);
    }
}
