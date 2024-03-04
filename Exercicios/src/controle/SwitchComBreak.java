package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
String conceito = "";
System.out.println("Informe a nota de 0 a 10 para avaliar o produto.  ");
int nota = sc.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                        break;
            case 8: case 7: {
                conceito = "b";
                break;
            }
            case 6:
                case 5:
                conceito = "c";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
                conceito = "E";
                break;
            default:
                System.out.println("O conceito não foi encontrado. ");
        }
System.out.println("O conceito é: " +conceito);
        sc.close();
    }
}
