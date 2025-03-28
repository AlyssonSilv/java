package Desafio03;

public class Moto extends Veiuculo implements Controller {
    public Moto(String modelo, int anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Sua " + modelo + " está acelerando");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Modelo : " + modelo + " Ano fabricação : " + anoFabricacao);
    }

    @Override
    public void ligar() {
        System.out.println("Sua " + modelo + " está ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Sua " + modelo + " está desligada");
    }
}
