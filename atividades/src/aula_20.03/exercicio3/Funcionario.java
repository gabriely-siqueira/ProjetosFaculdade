package exercicio3;

public class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double calculaSalario() {
        // A ser implementado nas subclasses Horista e Mensalista
        return 0.0;
    }
}
