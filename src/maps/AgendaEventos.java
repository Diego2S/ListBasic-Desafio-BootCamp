package maps;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    Map<LocalDate,Evento> agendaEvento;

    public AgendaEventos() {
        this.agendaEvento = new HashMap<>();
    }

    public void adicionandoEvento(LocalDate date,String nome,String atracao){
        Evento evento =new Evento(nome, atracao);
        agendaEvento.put(date,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventoMapTreeMap= new TreeMap<>(agendaEvento);
        System.out.println(eventoMapTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dateSet = agendaEvento.keySet();
//        Collection<Evento> values = agendaEvento.values();
//        agendaEvento.get();
        LocalDate  dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventoMapTreeMap= new TreeMap<>(agendaEvento);
        for(Map.Entry<LocalDate,Evento> entry: eventoMapTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("o proximo evendo "+ entry.getValue()+" Acontecera na data"+ entry.getKey());
                break;
            }
        }

    }


}
