package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> compras;
    private double valorTotal;

    public CarrinhoDeCompras() {
        this.compras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        compras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        compras.removeIf(compra -> compra.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal() {
        for (Item item : compras) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(compras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("comida", 10.0, 1);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("comida");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("maça", 5.0, 2);
        carrinhoDeCompras.adicionarItem("cenoura", 3.0, 4);
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total é: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
