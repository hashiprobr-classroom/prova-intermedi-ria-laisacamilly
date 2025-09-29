package br.edu.insper.desagil.pi.freela;

public class Tarefa {

    /* Atributos:*/
    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    /* Construtor:*/
    public Tarefa(int id){
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    /* Id pode ser lido e não escrito:*/
    public int getId() {
        return id;
    }

    /* Descricao pode ser lido e escrito:*/
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /* Inicio pode ser lido e não escrito:*/
    public Momento getInicio() {
        return inicio;
    }

    /* Fim pode ser lido e não escrito:*/
    public Momento getFim() {
        return fim;
    }

    /* Metodo atualiza:*/
    public void atualiza (Momento inicio, Momento fim){
        //

    }


}
