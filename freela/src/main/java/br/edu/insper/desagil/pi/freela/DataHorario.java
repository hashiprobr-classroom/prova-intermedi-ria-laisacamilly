package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{

    /* Atributos:*/
    private int hora;
    private int minuto;
    private Data data;

    /* Construtor:*/
    public DataHorario(Data data){
        this.hora = 0;
        this.minuto = 0;
        this.data = data;
    }

    /* Hora pode ser lida e não escrita:*/
    public int getHora() {
        return hora;
    }

    /* Minuto pode ser lido e não escrito:*/
    public int getMinuto() {
        return minuto;
    }

    /* Data pode ser lido e escrito:*/
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    /* Metodo atualiza:*/
    public void atualiza(int novaHora, int novoMin){
        if(novaHora < 0 || novaHora > 23){
            ajusta(novaHora, 0, 23); }
        else if (novoMin < 0 || novoMin > 59) {
            ajusta(novoMin, 0, 59);
        }

    }

    /* Metodo sobscreve:*/
    @Override
    public int minutos(){
        // Quantidade de minutos passados:*/
        return minutos();
    }

}
