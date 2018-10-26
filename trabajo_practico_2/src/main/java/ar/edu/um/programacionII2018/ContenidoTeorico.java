package ar.edu.um.programacionII2018;


public class ContenidoTeorico {
    private String tema;
    private String descripcion;
    private int horasPresenciales;

    public ContenidoTeorico() {
        this.tema = "Punteros";
        this.descripcion = "........................";
        this.horasPresenciales = 4;
    }

    public ContenidoTeorico(String tema, String descripcion, int horasPresenciales) {
        this.tema = tema;
        this.descripcion = descripcion;
        this.horasPresenciales = horasPresenciales;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHorasPresenciales() {
        return horasPresenciales;
    }

    public void setHorasPresenciales(int horasPresenciales) {
        this.horasPresenciales = horasPresenciales;
    }

    @Override
    public String toString() {
        return "ContenidoTeorico{" +
                "tema='" + tema + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", horasPresenciales=" + horasPresenciales +
                '}';
    }
}
