package exercicio3;

public class Mensalista extends Funcionario {
    private double salarioBase;

    public Mensalista(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calculaSalario() {
        return salarioBase;
    }
}