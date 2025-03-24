package Desafio01;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev = new Desenvolvedor("Alysson", 2050.98);
        Gerente manager = new Gerente("Ruan", 20000);

        System.out.println("Cargo : " + manager.getCargo());
        System.out.println("Nome : " + manager.getNome());
        System.out.println("Salário : " + manager.getSalario());
        System.out.println("Bônus do Desafio01.Gerente : " + manager.calcularBonus());
        System.out.println("Salário total do Desafio01.Gerente com bônus: " + (manager.getSalario() + manager.calcularBonus()));

        System.out.println("");

        System.out.println("Cargo : " + dev.getCargo());
        System.out.println("Nome : " + dev.getNome());
        System.out.println("Salário : " + dev.getSalario());
        System.out.println("Bônus do Desafio01.Desenvolvedor : " + dev.calcularBonus());
        System.out.println("Salário total do Desafio01.Desenvolvedor com bônus: " + (dev.getSalario() + dev.calcularBonus()));
    }
}
