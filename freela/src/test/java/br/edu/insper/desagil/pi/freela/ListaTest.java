package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListaTest {

    @Test
    void constroi(){
        List<Tarefa> tarefas = new ArrayList<>();
        assertSame("[]", tarefas);
    }

}
