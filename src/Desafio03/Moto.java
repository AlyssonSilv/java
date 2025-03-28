package Desafio03;

public class Moto extends Veiculo implements Controller {

    public Moto(String modelo, int anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Sua " + getModelo() + " está acelerando.");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Modelo: " + getModelo() + " | Ano de fabricação: " + getAnoFabricacao());
    }

    @Override
    public void ligar() {
        System.out.println("Sua " + getModelo() + " está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Sua " + getModelo() + " está desligada.");
    }
}
