package OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTarefa {
    private List<Tarefas> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefaList.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefas();
    }
}
