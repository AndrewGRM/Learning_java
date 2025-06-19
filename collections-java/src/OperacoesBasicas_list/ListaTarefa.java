package OperacoesBasicas_list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist) {
            if(t.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefalist.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.adicionarTarefa("OperacoesBasicas_list.Tarefa 1");
        listaTarefa.adicionarTarefa("OperacoesBasicas_list.Tarefa 1");
        listaTarefa.adicionarTarefa("OperacoesBasicas_list.Tarefa 2");
        listaTarefa.adicionarTarefa("OperacoesBasicas_list.Tarefa 3");

        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        //listaTarefa.removerTarefa("OperacoesBasicas_list.Tarefa 3");
        System.out.println("O número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
