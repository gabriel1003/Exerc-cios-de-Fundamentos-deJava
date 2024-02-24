package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        //Aqui faremos conversões dos tipos maiores para os menores também chamadas de cast.
        int a = 127;
        byte b = (byte) a;
        System.out.println(b);

double d = 11.9999999;
        float f = (float) d; //Neste caso ele vai redusir para duas casas depois do ponto.
        System.out.println(f);

        int e = (int) d; //neste caso ele vai redusir o double removendo os números ndepois do ponto.
        System.out.println(e);
    }

}
