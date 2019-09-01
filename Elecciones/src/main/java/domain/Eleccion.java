package domain;

import java.util.ArrayList;
import java.util.List;

public class Eleccion {
    private List<Lista> listas;

    public Eleccion (){
        this.listas = new ArrayList<>();
    }

    public void agregarLista(Lista lista){
        this.listas.add(lista);
    }

    public int cantidadDeListas(){
        return this.listas.size();
    }
}
