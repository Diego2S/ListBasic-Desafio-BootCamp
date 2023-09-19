package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinho = new ArrayList<>();

    public void adicionarItem(String nome,Double preco, Integer quantidade){
        carrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!carrinho.isEmpty()){
            for(Item i: carrinho){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }
            carrinho.removeAll(itemsParaRemover);
        } else {
            System.out.println("Carrinho vazio.");
        }
    }
    public Double calcularValor(){
        double valorTotal=0;
        if(!carrinho.isEmpty()){
            for(Item i :carrinho){

                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        }else {
            throw new RuntimeException("Carrinho esta vazio.");
        }
    }

    public void exibirItens(){
        if(!carrinho.isEmpty()){
            System.out.println(carrinho);
        }else {
            System.out.println("Carrinho vazio");
        }
    }


}
