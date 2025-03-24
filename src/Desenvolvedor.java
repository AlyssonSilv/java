public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, "Desenvolvedor", salario); // Define o cargo diretamente
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.2; // Bônus de 20%
    }
}
