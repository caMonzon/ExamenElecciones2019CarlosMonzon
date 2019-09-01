package domain;

import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;

public class ListaTest {
    private Candidato macri;
    private Candidato vidal;
    private Lista Cambiemos;

    @Before
    public void init(){
        this.macri = new Candidato("Mauricio", Cargo.PRESIDENTE);
        this.vidal = new Candidato("Maria Eugenia", Cargo.GOBERNADOR);
        this.Cambiemos = new Lista("Cambiemos", 1);
    }

    @Test
    public void agregarCandidatosALista (){
        this.Cambiemos.agregarCandidato(macri);
        this.Cambiemos.agregarCandidato(vidal);
        this.Cambiemos.cantidadDeCandidatos();

        Assert.assertEquals(2, this.Cambiemos.cantidadDeCandidatos());
    }

}
