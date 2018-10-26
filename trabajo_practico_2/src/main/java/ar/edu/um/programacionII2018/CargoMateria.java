package ar.edu.um.programacionII2018;

public class CargoMateria {
    private Materia materia;
    private Cargo cargo;

    public CargoMateria() {
        this.materia = new Materia();
        this.cargo = new Cargo();
    }

    public CargoMateria(Materia materia, Cargo cargo) {
        this.materia = materia;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "CargoMateria{" +
                "materia=" + materia.toString() +
                ", cargo=" + cargo.toString() +
                '}';
    }
}