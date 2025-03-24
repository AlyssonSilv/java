package Desafio02;


public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String modelo, String marca, int ano, int quantidadePortas) {
        super(modelo, marca, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + "), Portas: " + quantidadePortas);
    }
}

