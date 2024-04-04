package exercicio2;

public class Numero {
    private int limite;
    private int valor;

    public Numero(int limite) {
        this.limite = limite;
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void incremento() {
        valor = (valor + 1) % limite;
    }
}
