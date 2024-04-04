package exercicio1;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Produto> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public double valorTotal() {
        double total = 0;
        for (Produto produto : itens) {
            total += produto.getValor();
        }
        return total;
    }
    public void mostrarPedido() {
        System.out.println("Itens do Pedido:");
        for (int i = 0; i < itens.size(); i++) {
            Produto produto = itens.get(i);
            System.out.println((i+1) + ". " + produto.getDescricao() + " - R$" + produto.getValor());
        }
        System.out.println("Valor total do pedido: R$" + valorTotal());
    }
}
