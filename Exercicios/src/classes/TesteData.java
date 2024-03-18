package classes;

public class TesteData {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 10;
        d1.mes = 03;
        d1.ano = 2024;
        System.out.println(d1.dataFormatada());
    }
}
