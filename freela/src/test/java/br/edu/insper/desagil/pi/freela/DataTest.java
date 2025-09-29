package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class DataTest {

    @Test
    void constroi(){
        Data data = new Data();

        // Dia, mes e ano:
        assertEquals(1, data.getDia());
        assertEquals(1, data.getMes());
        assertEquals(1970, data.getAno());

        // Minutos:
        assertEquals(0, data.minutos());
    }

    @Test
    void dataBaixa(){
        Data data = new Data();

        data.atualiza(0, 0, 1969);

        // Dia, mes e ano:
        assertEquals(1, data.getDia());
        assertEquals(1, data.getMes());
        assertEquals(1970, data.getAno());

        // Minutos:
        assertEquals(0, data.minutos());
    }

    @Test
    void dataAlta(){
        Data data = new Data();
        data.atualiza(32,13,2071);

        // Dia, mes e ano:
        //assertEquals(31, data.getDia());
        //assertEquals(12, data.getMes());
        //assertEquals(2070, data.getAno());

        // Minutos:
        assertEquals(53084160, data.minutos());
    }


}
