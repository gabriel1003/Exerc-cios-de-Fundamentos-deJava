package Fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        //Neste programa estaremos convertendo tipos numéricos para strings.

        Integer nu1 = 10000;
        System.out.println(nu1.toString().length()); //Quando convertemos um tipo numérico para um string, podemos usar o length para ver quantos caracteres estamos usando.

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length()); //Esta é outra forma de de conversão.

        System.out.println(("" + nu1).length()); //Assim também é pocivel converteros tipos.
    }
}
