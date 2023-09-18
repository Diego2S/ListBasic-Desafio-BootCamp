import OperacoesBasicas.CarrinhoDeCompras;
import OperacoesBasicas.Item;
import OperacoesBasicas.ListaTarefa;
import Pesquisa.CatalogoLivros;

public class Main {
    public static void main(String[] args) {

        CatalogoLivros listaLivros= new CatalogoLivros();

        listaLivros.adicionarLivro("Livro 1","eu",2023);
        listaLivros.adicionarLivro("Livro 2","eu",2020);
        listaLivros.adicionarLivro("Livro 3","vc",2023);
        listaLivros.adicionarLivro("Livro 4","eu",2021);
        listaLivros.adicionarLivro("Livro 7","vc",2020);

        System.out.println(listaLivros.pesquisarPorAutor("eu"));
        System.out.println(listaLivros.pesquisarPorIntervaloAnos(2022,2023));
        System.out.println(listaLivros.pesquisarPorTitulo("livro 7"));






    }
}