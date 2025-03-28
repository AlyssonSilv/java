package Desafio03;

public abstract class Veiuculo {
    String modelo;
    int anoFabricacao;

    public Veiuculo(String modelo, int anoFabricacao) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void acelerar();
    public void exibirDetalhes(){
        System.out.println("Detalhes do Veiculo abaixo ");
    };
}
