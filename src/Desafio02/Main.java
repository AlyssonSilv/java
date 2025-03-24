package Desafio02;


public class Main {
    public static void main(String[] args) {
        // Criando veículos
        Carro carro = new Carro("Corolla", "Toyota", 2022, 4);
        Moto moto = new Moto("CB 500", "Honda", 2021, 500);

        // Criando um cliente
        Cliente cliente = new Cliente("Carlos Silva", "123.456.789-00");

        // Alugar carro sem seguro
        cliente.alugarVeiculo(carro, 5, false);

        // Alugar moto com seguro
        cliente.alugarVeiculo(moto, 3, true);
    }
}

