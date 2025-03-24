public class Desenvolvedor  extends Funcionario {

    public Desenvolvedor(String nome, String cargo, double salario) {
        super(nome, cargo, salario);
    }

    //    public Desenvolvedor() {
//
//    }
    @Override
    public double calcularBonus() {
        return getSalario() * 0.05;

    }
}