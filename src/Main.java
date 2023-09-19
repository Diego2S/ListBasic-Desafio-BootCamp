import Ordenacao.OrdenacaoPessoa;
import Ordenacao.Pessoa;

public class Main {
    public static void main(String[] args) {

        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();

        pessoa.adicionarPessoa(new Pessoa("nome 1",12,1.50));
        pessoa.adicionarPessoa(new Pessoa("nome 2",22,1.80));
        pessoa.adicionarPessoa(new Pessoa("nome 4",42,1.90));
        pessoa.adicionarPessoa(new Pessoa("nome 3",16,1.70));

        System.out.println(pessoa.getPessoaList());

        System.out.println(pessoa.ordenadoPorIdade());
        System.out.println(pessoa.ordenarPorAltura());





    }
}