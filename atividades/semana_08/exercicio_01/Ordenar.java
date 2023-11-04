package atividades.semana_08.exercicio_01;

import java.util.Collections;
import java.util.List;

public class Ordenar<E extends Comparable<E>> {
    public void ordenarElementos(List<E> elementos){
        Collections.sort(elementos);
    }
}