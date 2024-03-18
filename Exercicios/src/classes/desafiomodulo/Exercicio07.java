package classes.desafiomodulo;

public class Exercicio07 {
    public static void somImparMultiPar() {
        long par = 0;
        int impar = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                if (i > 2) {
                    par = par * i;
                } else {
                    par = i;
                }
            } else{
                impar = impar + i;
            }
        }
        System.out.println(par);
        System.out.println(impar);
    }

    public static void main(String[] args) {
        somImparMultiPar();
    }
}
