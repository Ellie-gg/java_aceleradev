package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
        if(tarefa != null && tarefa.obterTamanhoTarefa() <= 20) {
            this.tarefas.add(tarefa);
        }else{
            System.out.println("A tarefa é inválida");
        }
    }

    public void remover(int posicao){
        this.tarefas.remove(posicao);

    }

    public void exibirTarefas(){
        for (Tarefa tarefa: tarefas){
            tarefa.exibirTarefa();
        }
    }
}
