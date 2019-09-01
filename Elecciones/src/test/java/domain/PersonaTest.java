package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
    public Persona persona1;
    public Candidato macri;

    @Before
    public void init(){
        this.persona1 = new Persona("Carlos",18);
        this.macri = new Candidato("Mauricio", Cargo.PRESIDENTE);
    }

    @Test
    public void personaVotó(){
        this.persona1.vota(macri);


        Assert.assertEquals(1, this.macri.sumarVoto(1));
    }
}
