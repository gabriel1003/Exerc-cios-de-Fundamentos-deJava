package Fundamentos;

public class ConhecendoWrappers {
    public static void main(String[] args) {
        //aqui vamos trabalhar com wrappers que nada mais é que, class aonde estáo envolvidos os tipos primitivos.
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //Este é o wrapper do int ou seja, do tipo inteiro.
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F;

        Double d = 1234.5678;
        System.out.println(f);
        System.out.println(d);
Boolean bo = Boolean.parseBoolean("true");

Character c = '#';

        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        System.out.println(c + "...");
    }
}
