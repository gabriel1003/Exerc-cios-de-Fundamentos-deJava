package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args){

//        Números inteiros.
//        byte numeroMaximo = 127; // Este tipo suporta o maximo de 127 e o mínimo de -128 sendo assim o valor de 8 bits.
        short numeroSuportado = 32767; // Este tipo suporta o mínimo de 32768 e o máximo de 32767 sendo o total de 16 bits.
        int valorMaximo = 2147483647; // Este tipo suporta o valor máximo já declarado e mínimo de 2147483648 sendo o total de 32 bits.
        long valorLimite = 4294967295l; // Este tipo suporta o valor máximo já declarado e o mínimo é só acrecentar mais 1 a o valor máximo. ele vale o equivalente a 64 bits.

//        aqui estão os tipos numéricos reais que são: o float suportando 32 bits, o double suportando 64 bits e os boleanos que apenas devolvem true ou false.

        System.out.println(valorLimite);

    }
}
