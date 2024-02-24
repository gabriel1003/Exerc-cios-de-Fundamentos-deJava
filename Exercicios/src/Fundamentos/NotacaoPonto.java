package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bondia X";
        s = s.replace("X", "Senhora"); // a função do replace é de substituir um caracter por uma nova palavra ou seja, o X pela palavra senhora.
        s = s.toUpperCase(); // o toUpperCase tem a função de por toda a palavra em maiuscula.
        s = s.concat(" seu marido chegou"); //o concat faz, a concatenação de variáveis.
        System.out.println(s);

        //a outra forma de fazermos o mesmo código é da seguinte maneira:

        String b = "bom dia p".replace("p", "Pedro").toUpperCase()
                .concat("!!!");
        //Desta forma podemos ver que se pode declarar tudo em uma só linha ou em linhas separadas.
        System.out.println(b);
    }
}
