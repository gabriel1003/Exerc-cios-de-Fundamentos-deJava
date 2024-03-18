package classes;

public class ValoresVsReferencias {
    public static void main(String[] args) {

        //Nesta class vamos testar os valores e como funciona eles em memória e também como se comporta os valores por referéncia nos objetos.
        int a = 2;
        int b = a; //aqui criamos um valor cópia na memória.
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);
Data d1 = new Data(01, 01, 1970);
Data d2 = d1; //aqui criamos um valor por referéncia na memória.
        d1.ano = 2025;
        d2.mes = 06;
        d1.dia = 7;
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
        Data d3 = new Data();
        System.out.println(d3.dataFormatada());
    }
}
