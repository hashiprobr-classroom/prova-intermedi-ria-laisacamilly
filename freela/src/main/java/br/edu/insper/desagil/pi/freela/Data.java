package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{

    /* Atributos:*/
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;

    /* Construtor:*/
    public Data(){
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }

    /* Ano pode ser lido e não escrito:*/
    public int getAno() {
        return ano;
    }

    /* Mes pode ser lido e não escrito:*/
    public int getMes() {
        return mes;
    }

    /* Dia pode ser lido e não escrito:*/
    public int getDia() {
        return dia;
    }

    /* Metodo atualiza:*/
    public void atualiza(int novoDia, int novoMes, int novoAno){

        if( novoAno < 1970 || novoAno > 2070 ){
            ajusta(novoAno, 1970, 2070); }

        else if ( novoMes < 1 || novoMes > 12 ){
            ajusta(novoMes, 1, 12); }

        else if ( novoDia < 1 || novoDia > 31 ){
            ajusta(novoDia, 1, 31);
        }
        else{
            atualiza(novoDia,novoMes,novoAno);
        }
    }

    /* Metodo sobscreve:*/
    @Override
    public int minutos(){
        // Quantidade de minutos passados entre 1 de janeiro de 1970 ate a data querida:
        // 1 dia tem 1440 minutos.

        int soma = 0;

        // Pra começar em zero:
        if (getDia() == 1 && getMes() == 1 && getAno() == 1970){
            return 0; }

        else{
            //Pra cada mes em limites:
            for (int mes : limite.keySet()){
                //Pra cada dias dentro do mes:
                for(int dias : limite.values()){
                    int minutos = (1440 * dias);
                    soma += minutos;
                }
            }
        }

        return soma;
    }

}
