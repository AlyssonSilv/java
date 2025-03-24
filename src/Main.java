import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Funcionario funcionario = new Funcionario();
//
//        Scanner scanf = new Scanner(System.in);
//        System.out.println("Digite seu nome");
//        funcionario.setNome(scanf.nextLine());
//
//        System.out.println("Digite seu cargo");
//        funcionario.setCargo(scanf.nextLine());
//
//        System.out.println("Informe seu salario");
//        funcionario.setSalario(scanf.nextDouble());
//
//
//        System.out.println(funcionario.getNome());
//        System.out.println(funcionario.getCargo());
//
//     Desenvolvedor desenvolvedor = new Desenvolvedor();
//     Gerente gerente = new Gerente();

        Gerente gerente = new Gerente("joao", "gerente", 1200);
        Desenvolvedor dev = new Desenvolvedor("Larissa", "dev", 1700);

        System.out.println(" nome: " + gerente.getNome() + " \n cargo:" + gerente.getCargo() + " \n salario: " + gerente.getSalario() );
        System.out.println(" nome: " + dev.getNome() + " \n cargo:" + dev.getCargo() + " \n salario: " + dev.getSalario() );
        System.out.println("aumento gerente:  " + gerente.getSalario() + gerente.calcularBonus());
        System.out.println("aumento dev:  " + dev.getSalario() + dev.calcularBonus());
    }
}