package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(Contato c){
        contatoSet.add(c);
    }

    public void exibirContato(){
        for (Contato c:contatoSet){
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome= new HashSet<>();
        for(Contato c :contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualiozarNumeroContato(String nome,int novoNumero){
        Contato contatoAtual = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtual = c;
                break;
            }
        }
        return contatoAtual;
    }


}
