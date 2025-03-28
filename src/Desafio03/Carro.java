package Desafio03;

public class Carro extends Veiculo implements Controller {

    public Carro(String modelo, int anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Seu " + getModelo() + " está acelerando.");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Modelo: " + getModelo() + " | Ano de fabricação: " + getAnoFabricacao());
    }

    @Override
    public void ligar() {
        System.out.println("O seu " + getModelo() + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O seu " + getModelo() + " está desligado.");
    }
}
