package Fundamentos;

public class DadosFuncionario {
    public static void main(String[] args) {

        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3134845223L;

        float salario = 11445.44F;
        double vendasAcumuladas = 2991797103.01;
        boolean estaDeFerias = false;
        char status = 'a';

    System.out.println("o funcionario tem " +anosDeEmpresa +"anos de empresa");
    System.out.println("o funcionario fez ao todo pela empresa" +numerosDeVoos);
    System.out.println("o Funcionário acumulou ao todo " +pontosAcumulados + "pontos de voos ");
     System.out.println(id +"ganha" +salario);
     System.out.println("Férias !" +estaDeFerias);
     System.out.println(" Estátus do funcionário: " +status);
    }
}
