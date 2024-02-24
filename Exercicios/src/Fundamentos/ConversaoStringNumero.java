package Fundamentos;


import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        //Aqui estaremos convertendo, do tipo string para o numérico.
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: "); //Este importe faz com que, apareça uma tela para o usuário digitar.
        String valor2 = JOptionPane.showInputDialog("Digite o Segundo número: ");

        System.out.println(valor1 + valor2); //Aqui estaremos concatenando as strings com valores digitados.

        double numero1 = Double.parseDouble(valor1); //aqui estaremos convertendo strings em números.
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2; //aqui estaremos somando o valor das strings.
        System.out.println("A soma é: " +soma);
        System.out.println("A média é:" + soma /2);
    }
}
