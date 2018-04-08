package ar.um.edu.programacion_2018.TP2_consigna01;

public class ProfesorTitular extends Profesor {
    private ContenidoTeorico contenidoTeorico;

    public ProfesorTitular() {
        super();
        this.contenidoTeorico = new ContenidoTeorico();
    }

    public ProfesorTitular(ContenidoTeorico contenidoTeorico) {
        super();
        this.contenidoTeorico = contenidoTeorico;
    }

    public ContenidoTeorico getContenidoTeorico() {
        return contenidoTeorico;
    }

    public void setContenidoTeorico(ContenidoTeorico contenidoTeorico) {
        this.contenidoTeorico = contenidoTeorico;
    }

    @Override
    public String toString() {
        return "ProfesorTitular{" +
                super.toString() +
                "contenidoTeorico=" + contenidoTeorico +
                '}';
    }
}
