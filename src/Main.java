import list.Ordenacao.OrdenacaoPessoa;
import list.Ordenacao.Pessoa;
import set.ConjuntoConvidados;
import set.Convidado;

public class Main {
    public static void main(String[] args) {

        ConjuntoConvidados conv = new ConjuntoConvidados();

        conv.exibirConvidados();
        conv.adicionarConvidado(new Convidado("conv1",1));
        conv.adicionarConvidado(new Convidado("conv2",2));
        conv.adicionarConvidado(new Convidado("conv3",2));
        conv.adicionarConvidado(new Convidado("conv4",4));
        conv.adicionarConvidado(new Convidado("conv5",5));

        conv.exibirConvidados();
        System.out.println();
        conv.removerConvidadoPorCodigo(5);
        conv.exibirConvidados();
    }
}