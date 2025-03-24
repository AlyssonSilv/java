package Desafio02;


public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void alugarVeiculo(Veiculo veiculo, int dias, boolean seguro) {
        System.out.println("\nCliente: " + nome);
        veiculo.exibirDetalhes();
        System.out.println("Aluguel por " + dias + " dias: R$ " + veiculo.calcularAluguel(dias, seguro));
    }
}

