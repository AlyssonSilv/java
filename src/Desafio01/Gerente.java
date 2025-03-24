package Desafio01;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, "Desafio01.Gerente", salario); // Define o cargo diretamente
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.3; // Bônus de 30%
    }
}
