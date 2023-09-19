package maps;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade,double preco){
        estoqueProdutosMap.put(cod,new Produto(nome,quantidade,preco));
    }

    public void exibiProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotal(){
        double valorTotal=0;
        if (!estoqueProdutosMap.isEmpty()){
            for(Produto p:estoqueProdutosMap.values()){
                valorTotal += p.getQuantidade()*p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro=null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p:estoqueProdutosMap.values()){
            if (p.getPreco()>maiorPreco){
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato=null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p:estoqueProdutosMap.values()){
            if (p.getPreco()<menorPreco){
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

}
