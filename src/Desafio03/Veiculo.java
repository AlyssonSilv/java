package Desafio03;

public abstract class Veiculo {
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Método abstrato
    public abstract void acelerar();

    // Método concreto
    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    // Getters para acessar os atributos privados
    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}
