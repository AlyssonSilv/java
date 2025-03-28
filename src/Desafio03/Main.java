package Desafio03;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro("Corolla", 2025);
        Moto moto = new Moto("MT-09", 2020);
        moto.exibirDetalhes();
        moto.acelerar();
        moto.ligar();
        moto.desligar();

        System.out.println();

        car.exibirDetalhes();
        car.desligar();
        car.acelerar();
        car.ligar();
        car.desligar();
    }
}
