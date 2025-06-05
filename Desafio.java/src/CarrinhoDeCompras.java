package Loja;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    //atributo
    private List<Item> Compras;

    public CarrinhoDeCompras() {
        this.Compras = new ArrayList<>();
    }

    public void  adicionarItem(String descricao, double preco, int quantidade) {
        Item compras =new Item(descricao, preco,quantidade);
        this.Compras.add(compras);
    }

    @SuppressWarnings("unlikely-arg-type")
    public void removerItem(String descricao) {
        List<Item> ItensParaRemover = new ArrayList<>();
        if(!Compras.isEmpty()) {
        for(Item I: Compras) {
            if(I.getDescricao().equalsIgnoreCase(descricao)){
                ItensParaRemover.add(I);
            }
        }
        Compras.remove(ItensParaRemover);
        }else{
            System.out.println("Alista esta vazia!");
        }
    }
    public double ValorDasCompras() {
        double valorTotal =0d;
        if(!Compras.isEmpty()) {
            for (Item compras : Compras) {
                double valorItem = compras.getValor() *compras.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
        throw new RuntimeException("A lista está vazia!");
        }
    }
        public void ListaItens() {
            if (!Compras.isEmpty()) {
                System.out.println(this.Compras);
            }else{
                System.out.println("A lista esta vazia!");
            }
        }
        public String toString() {
            return "CarrinhoDeCompras{" +
            "itens=" + Compras + '}';
        }

        public static void main(String[] args) {
            CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

            carrinhoDeCompras.adicionarItem("Lápis", 10, 3);
            carrinhoDeCompras.adicionarItem("Borracha", 3, 2);
            carrinhoDeCompras.adicionarItem("Caderno", 20, 1);


            carrinhoDeCompras.ListaItens();

            carrinhoDeCompras.removerItem("Lápis");

            carrinhoDeCompras.ListaItens();
        
            System.out.println("Ovalor Total da compra é =" + carrinhoDeCompras.ValorDasCompras());
    }

}
