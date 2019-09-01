package domain;

public class PartidoPolitico {
    public String nombre;
    public String fechadeformacion;
    public boolean vigencia;

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public boolean getVigencia() {
        return vigencia;
    }

    public PartidoPolitico(String nombre, String fechadeformacion, boolean vigencia){
        this.nombre = nombre;
        this.fechadeformacion = fechadeformacion;
        this.vigencia = vigencia;
    }

    public void revocarVigencia (boolean vigencia){
        if (!vigencia){
            setVigencia(true);
        }
    }


}
