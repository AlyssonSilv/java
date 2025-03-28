package Desafio03;

public class Main {
    public static void main(String[] args) {

        Carro car = new Carro("Corolla", 2025);
        Moto moto = new Moto("MT-09", 2020);

        // Testando o comportamento da moto
        System.out.println("----- Moto -----");
        moto.exibirDetalhes();
        moto.acelerar();
        moto.ligar();
        moto.desligar();

        System.out.println();

        // Testando o comportamento do carro
        System.out.println("----- Carro -----");
        car.exibirDetalhes();
        car.acelerar();
        car.ligar();
        car.desligar();
    }
}
