package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EleccionTest {
    private Lista cambiemos;
    private Lista todos;
    private Lista frenteDeIzquierda;
    private Eleccion año2019;

    @Before
    public void init(){
        this.cambiemos = new Lista("Cambiemos", 1);
        this.todos = new Lista("Todos", 2);
        this.frenteDeIzquierda = new Lista("Frente de Izquierda", 3);
        this.año2019 = new Eleccion();
    }

    @Test
    public void agregarListasAEleccion(){
        this.año2019.agregarLista(cambiemos);
        this.año2019.agregarLista(todos);
        this.año2019.agregarLista(frenteDeIzquierda);
        this.año2019.cantidadDeListas();

        Assert.assertEquals(3, this.año2019.cantidadDeListas());
    }
}
