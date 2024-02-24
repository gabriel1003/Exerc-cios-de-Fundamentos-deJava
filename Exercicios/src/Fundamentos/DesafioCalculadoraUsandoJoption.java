package Fundamentos;

import javax.swing.*;

public class DesafioCalculadoraUsandoJoption {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número da operação: ");
        String tipoOperacao = JOptionPane.showInputDialog("Digite qual será o tipo da operação: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        double soma1 = Double.parseDouble(valor1);
        double soma2 = Double.parseDouble(valor2);

        double resultado = "+".equals(tipoOperacao) ? soma1 + soma2 : 0;
        resultado = "-".equals(tipoOperacao) ? soma1 - soma2 : resultado;
        resultado = "/".equals(tipoOperacao) ? soma1 / soma2 : resultado;
        resultado = "*".equals(tipoOperacao) ? soma1 * soma2 : resultado;
        resultado = "%".equals(tipoOperacao) ? soma1 % soma2 : resultado;

        System.out.println("O resultado da operação é: " +resultado);
    }
}
