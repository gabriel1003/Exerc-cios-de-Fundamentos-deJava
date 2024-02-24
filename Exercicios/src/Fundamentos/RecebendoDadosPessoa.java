package Fundamentos;

import javax.swing.*;

public class RecebendoDadosPessoa {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o seu Sobrenome: ");
        String cpf = JOptionPane.showInputDialog("Digite o seu CPF");

        System.out.println("Oi " +nome +" " +sobreNome +"\nDe CPF " +cpf);
    }
}
