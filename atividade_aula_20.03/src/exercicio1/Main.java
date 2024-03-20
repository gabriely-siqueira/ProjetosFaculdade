package exercicio1;

public class Main {
    public static void main(String[] args) {
        var produto1 = new Produto(01,"Bolacha", 3.50);
        var produto2 = new Produto(02,"Coca Cola", 1.50);
        Pedido pedido1 = new Pedido();
        pedido1.adicionarItem(produto1);
        pedido1.adicionarItem(produto2);
        pedido1.mostrarPedido();

    }
}