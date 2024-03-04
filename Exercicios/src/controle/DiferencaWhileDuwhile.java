package controle;

public class DiferencaWhileDuwhile {
    public static void main(String[] args) {
        //Esecuta a condição enquanto for verdadeira.
        int contador = 10;
        while (contador <=10) {
            System.out.println(contador++);
        }

        //esecuta primeiro o código e depois confere se é verdadeiro ou não.
        do {
            System.out.println(contador ++);
        } while (contador <=10);
    }
}
