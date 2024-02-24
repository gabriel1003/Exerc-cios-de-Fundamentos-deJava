package Fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        //Aqui vamos esplorar um pouco os tipos lógicos.

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2); //Quando usamos o sinal de ! negamos o valor da variável condicao2 que é falço tornando assim, verdadeiro o resultado.
        System.out.println(condicao1 || condicao2); //aqui vai ser pego um dos dois resultados para dar se será verdadeiro ou falço.
        System.out.println(condicao1 ^ condicao2); //o sinal ^ serve para darmos o ou absoluto.
        System.out.println(!!condicao1);
        System.out.println(!condicao2);
        System.out.println("A tabela verdade É (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println("\nTabela verdade (OR"); //Antes trabalhamos a tabela verdade do & agora trabalharemos a do OR.
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade do OU Exclusivo (XOR)");
        System.out.println(true ^ true); //Neste caso, o resultado será false pois o resultado da segunda variável é false.
        System.out.println(true ^ false); // neste caso vai dar verdadeiro pois o o primeiro é true e o segundo é false.
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade do (NOT)");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
