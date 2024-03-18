package classes;

public class Produto {
    String nome;
    float preco;
    double desconto;

    Produto() {

    }
    Produto(String nomeInicial, float precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }
    double precoComDesconto() {
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

}
