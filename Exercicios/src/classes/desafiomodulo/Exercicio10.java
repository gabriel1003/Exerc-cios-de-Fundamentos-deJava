package classes.desafiomodulo;

public class Exercicio10 {
    private String nomeFabricante;
    private String modeloDoCarro;
    private int ano;
    public Exercicio10(String nomeFabricante, String modeloDoCarro, int ano) {
        this.nomeFabricante = nomeFabricante;
        this.modeloDoCarro = modeloDoCarro;
        this.ano = ano;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void apresentar() {
        System.out.println("Nome do fabricante: " +this.getNomeFabricante());
        System.out.println("Modelo do carro: " +this.getModeloDoCarro());
        System.out.println("Ano do carro: " +this.getAno());
    }

    public static void main(String[] args) {
        Exercicio10 carro = new Exercicio10("BMW", "O mais moderno", 2024);
        carro.apresentar();
    }
}
