package Desafio03;

public class Carro extends Veiuculo implements Controller {
    public Carro(String modelo, int anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Seu " + modelo + " está acelerando");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Modelo : " + modelo + " Ano fabricação : " + anoFabricacao);
    }

    @Override
    public void ligar() {
        System.out.println("O seu" + modelo + " está ligado");
    }

    @Override
    public void desligar() {
        System.out.println(" O seu" + modelo + " está desligado");
    }
}
