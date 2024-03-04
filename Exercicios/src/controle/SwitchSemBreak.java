package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "branca";
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Eu sei o Bassai-dai");
        case "marrom":
            System  .out.println("Sei o Tekki Shodam");
            case "roxa":
                System.out.println("Sei o Heian Godan ");
            case "verde":
                System.out.println("Sei o Heian Yodan \n");
            case "laranja":
                System.out.println("Sei o Heian Sandan\n");
            case "vermelha":
                System.out.println("Sei o Heian Nidan\n");
            case "amarela":
                System.out.println("Sei o Heian Shodan\n");
        break;
            default:
                System.out.println("Não sei nada");
        }

        System.out.println("Eu sei.");
        int idade = 2;
        switch (idade) {
            case 3:
                System.out.println("Sabe progreamar. ");
            case 2:
                System.out.println("Sabe falar. ");
            case 1:
                System.out.println("Sabe andar. ");
            case 0:
                System.out.println("Sabe respirar. ");
        }
    }
}
