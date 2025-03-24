public class Gerente extends Funcionario{

    public Gerente(String nome, String cargo, double salario){
        super(nome, cargo, salario);
    }
    //    public Gerente(){
//
//    }
    @Override
    public double calcularBonus(){
        return getSalario() * 10;
    }
}
