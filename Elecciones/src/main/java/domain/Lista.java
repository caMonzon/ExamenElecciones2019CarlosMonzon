package domain;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private String nombre;
    private int numero;
    private List<Candidato> candidatos;
    private List<PartidoPolitico> partidos;

    public Lista (String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
        this.candidatos = new ArrayList<>();
    }

    public void agregarPartido(PartidoPolitico partidoPolitico){
        if (partidoPolitico.getVigencia()){
            this.partidos.add(partidoPolitico);
        }
    }

    public int cantidadDePartidos(){
        return this.partidos.size();
    }

    public void agregarCandidato (Candidato candidato){
        this.candidatos.add(candidato);
    }

    public int cantidadDeCandidatos(){
        return this.candidatos.size();
    }
}
