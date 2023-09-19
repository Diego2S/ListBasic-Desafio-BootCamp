import maps.AgendaContatos;
import maps.AgendaEventos;
import maps.EstoqueProdutos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionandoEvento(LocalDate.of(2023,9,25),"Show","pitty");
        agendaEventos.adicionandoEvento(LocalDate.of(2023,9,20),"Show","vitar");
        agendaEventos.adicionandoEvento(LocalDate.of(2023,12,25),"natal","papai noel");


        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}