package Desafio02;


public abstract class Veiculo {
    protected String modelo;
    protected String marca;
    protected int ano;

    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    // Método abstrato para exibir detalhes
    public abstract void exibirDetalhes();


    public double calcularAluguel(int dias) {
        return dias * 100; // Valor fixo por dia
    }


    public double calcularAluguel(int dias, boolean seguro) {
        double valorBase = calcularAluguel(dias);
        return seguro ? valorBase * 1.2 : valorBase;
    }
}

