public class Funcionario {
    private String cargo;
    private String nome;
    private double salario;

    public Funcionario(String cargo, String nome, double salario) {
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
