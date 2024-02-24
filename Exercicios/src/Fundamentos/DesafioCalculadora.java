package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite o primeiro número a ser cauculado: ");
        double primeiroNumero = sc.nextDouble();

        System.out.println("Digite o outro número: ");
        double outroNumero = sc.nextDouble();

        System.out.println("Digite o tipo da operação: ");
        String operador = sc.next();

        double resultado = "+".equals(operador) ? primeiroNumero + outroNumero : 0;
        resultado = "-".equals(operador) ? primeiroNumero - outroNumero : resultado;
        resultado = "*".equals(operador) ? primeiroNumero * outroNumero : resultado;
        resultado = "/".equals(operador) ? primeiroNumero / outroNumero : resultado;
        resultado = "%".equals(operador) ? primeiroNumero % outroNumero : resultado;

        System.out.printf("%.2f %s %.2f = %.2f." ,primeiroNumero ,operador ,outroNumero ,resultado);
    sc.close();
    }
}
