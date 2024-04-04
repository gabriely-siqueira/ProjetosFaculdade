package exercicio3;

public class Main {
    public static void main(String[] args) {
    Empresa empresa1 = new Empresa("Nova Empresa");

    // Adicionando funcionários
    Horista horista1 = new Horista("Gabriely", 40, 25.0);
    Mensalista mensalista1 = new Mensalista("Maria", 3000.00);

        empresa1.addFuncionario(horista1);
        empresa1.addFuncionario(mensalista1);

    // Listando os funcionários e seus salários
        System.out.println("Funcionários da empresa " + empresa1.getNome() + ":");
        for (Funcionario funcionario : empresa1.getFuncionarios()) {
        System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.calculaSalario());
    }
}}


