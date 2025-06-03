package Loja;

public class Item {

    //Atributo
    private String descricao;
    private Double valor;
    private int quantidade;

    public Item(String descricao , Double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;

    }

    public String getDescricao() {
        return descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public Double getValor() {
        return valor;
    }
    public String toString() {
        return "Item{" +"nome'" +descricao+'\''+
                        ", preco=" +valor +
                        ", quant=" +quantidade+'}'; 
    }
}
