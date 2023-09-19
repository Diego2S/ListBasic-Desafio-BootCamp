package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> setConvidado;

    public ConjuntoConvidados() {
        this.setConvidado = new HashSet<>();
    }

    public void adicionarConvidado(Convidado convidado){
        setConvidado.add(convidado);
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: setConvidado){
            if(c.getCodigoConvite() ==codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        setConvidado.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return setConvidado.size();
    }

    public void exibirConvidados(){
        for(Convidado c: setConvidado){
        System.out.println(c);}
    }

}
