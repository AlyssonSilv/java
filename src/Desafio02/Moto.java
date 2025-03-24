package Desafio02;


public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, String marca, int ano, int cilindradas) {
        super(modelo, marca, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + marca + " " + modelo + " (" + ano + "), Cilindradas: " + cilindradas + "cc");
    }
}

