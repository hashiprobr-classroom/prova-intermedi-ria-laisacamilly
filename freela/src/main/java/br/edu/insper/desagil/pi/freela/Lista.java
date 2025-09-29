package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    /* Atributos:*/
    private List<Tarefa> tarefas;

    /* Construtor:*/
    public Lista(){
        this.tarefas = new ArrayList<>();
    }

    /* Tarefas pode ser lido e não escrito:*/
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    /* Metodo adiciona:*/
    public void adiciona (Tarefa tf){
        int id = tf.getId();
        if ( !(tarefas.equals(id)) ) {
            tarefas.add(tf);
        }

    }



}
