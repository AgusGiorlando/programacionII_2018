package ar.um.edu.programacion_2018.TP2_consigna01;

public class ProfesorAdjunto extends Profesor{
    private TrabajoPractico trabajoPractico;

    public ProfesorAdjunto() {
        super();
        this.trabajoPractico = new TrabajoPractico();
    }

    public ProfesorAdjunto(TrabajoPractico trabajoPractico) {
        super();
        this.trabajoPractico = trabajoPractico;
    }

    public ProfesorAdjunto(int profesor_id, String nombre, String apellido, CargoMateria cargoMateria, TrabajoPractico trabajoPractico) {
        super(profesor_id, nombre, apellido, cargoMateria);
        this.trabajoPractico = trabajoPractico;
    }

    public TrabajoPractico getTrabajoPractico() {
        return trabajoPractico;
    }

    public void setTrabajoPractico(TrabajoPractico trabajoPractico) {
        this.trabajoPractico = trabajoPractico;
    }

    @Override
    public String toString() {
        return "ProfesorAdjunto{" +
                super.toString() +
                "trabajoPractico=" + trabajoPractico +
                '}';
    }
}
