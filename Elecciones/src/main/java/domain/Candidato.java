package domain;

public class Candidato {
    private String nombre;
    private Cargo cargo;
    private int cantidadVotos;


    public Candidato (String nombre, Cargo cargo){
        this.nombre = nombre;
        this.cargo = cargo;
        this.cantidadVotos = 0;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public int sumarVoto(int unosVotos){
       return cantidadVotos ++;
    }


}
