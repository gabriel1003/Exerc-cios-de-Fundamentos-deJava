package Fundamentos;

public class Temperatura {

    public static final double DOUBLE = 5.0 / 9.0;

    public static void main(String[] args ){

//        Converção de fahrenheit em celsius.
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;
        double fahrenheit = 68;

        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println( +celsius);
    }
}
