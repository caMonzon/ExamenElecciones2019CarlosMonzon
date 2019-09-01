package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VigenciaTest {
    private PartidoPolitico frenteParaLaVictoria;
    private Lista kishnerismo;


    @Before
    public void init(){
        this.frenteParaLaVictoria = new PartidoPolitico("Frente Para La Victoria", "20/02/2015"
                ,false);

        this.kishnerismo = new Lista ("Kishnerismo", 20);
    }

    @Test
    public void agregarPartidoALista (){
        this.frenteParaLaVictoria.revocarVigencia(false);
        this.kishnerismo.agregarPartido(frenteParaLaVictoria);
        this.kishnerismo.cantidadDePartidos();

        Assert.assertEquals(1,this.kishnerismo.cantidadDePartidos());
    }
}
