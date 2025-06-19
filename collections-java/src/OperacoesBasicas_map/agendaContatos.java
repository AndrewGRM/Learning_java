package OperacoesBasicas_map;

import Pesquisa_set.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class agendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public agendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Andrew", 666666);
        agendaContatos.adicionarContato("Gustavo", 777777);
        agendaContatos.adicionarContato("João", 999999);
        agendaContatos.adicionarContato("Pedro", 333333);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Andrew"));
    }
}
