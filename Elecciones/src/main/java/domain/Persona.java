package domain;

public class Persona {
    private String nombre;
    private int edad;
    private boolean estadoVotacion;

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.estadoVotacion = false;
    }

    public void vota(Candidato candidato) {
        if (edad >= 16) {
            candidato.sumarVoto(1);
            estadoVotacion = true;
        }
    }
}
