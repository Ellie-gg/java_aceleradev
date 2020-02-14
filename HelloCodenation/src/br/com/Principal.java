package br.com;

import br.com.tarefas.Tarefa;
import br.com.tarefas.ListaTarefas;




public class Principal {
    public static void main(String[] args){
        System.out.println("minhas tarefas");
        System.out.println("-------------------");
        ListaTarefas tarefas = new ListaTarefas();
        Tarefa tarefa1 = new Tarefa("Regar as plantas");
        Tarefa tarefa2 = new Tarefa("Estudar");
        Tarefa tarefa3 = new Tarefa("Trabalhar");
        tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        tarefas.exibirTarefas();


    }

}
