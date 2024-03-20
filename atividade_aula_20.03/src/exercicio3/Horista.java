package exercicio3;

public class Horista extends Funcionario {
    private int qtdHoras;
    private double valorHoras;

    public Horista(String nome, int qtdHoras, double valorHoras) {
        super(nome);
        this.qtdHoras = qtdHoras;
        this.valorHoras = valorHoras;
    }

    @Override
    public double calculaSalario() {
        return qtdHoras * valorHoras;
    }
}