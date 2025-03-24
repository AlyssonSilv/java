public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, "Gerente", salario); // Define o cargo diretamente
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.3; // Bônus de 30%
    }
}
