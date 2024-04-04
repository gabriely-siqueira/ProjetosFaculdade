package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;

    public String getNome() {
        return nome;
    }

    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
