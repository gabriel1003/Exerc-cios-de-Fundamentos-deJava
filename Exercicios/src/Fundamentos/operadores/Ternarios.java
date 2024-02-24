package Fundamentos.operadores;

public class Ternarios {
    public static void main(String[] args) {

        float media = 8.6f;
        String resultadoFinal = media >= 7.0 ?
                "Aprovado. " :"Em recuperação. ";
    System.out.println("O aluno está " +resultadoFinal) ;

    float nota = 7.9f;
    boolean bomComportamento = true;
    boolean passouPorMedia = nota >= 7;
    boolean temDesconto = bomComportamento && passouPorMedia;
    String resultado = temDesconto ? "Sim." : "Não.";

    System.out.printf("Tem desconto? %s" ,resultado);
    }
}
