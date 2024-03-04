package controle;

import javax.swing.*;

public class UsandoIfeElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Escolha um Numero e descubra se ele é par ou não. ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("O número escolido é par. ");
        }
        else {
            System.out.println("O número é impar. ");
        }
    }
}
