package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {

    @Test
    void constroi(){
        Data d = new Data();
        d.atualiza(1,1,1970);

        DataHorario dh = new DataHorario(d);

        assertEquals(0, dh.getHora());
        assertEquals(0, dh.getMinuto());
    }



}
