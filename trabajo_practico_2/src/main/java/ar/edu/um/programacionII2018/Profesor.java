package ar.edu.um.programacionII2018;

public class Profesor {
    private int profesor_id;
    private String nombre;
    private String apellido;
    private CargoMateria cargoMateria;

    public Profesor() {
        this.profesor_id = 001;
        this.nombre = "Jaime";
        this.apellido = "Gonzalez";
        this.cargoMateria = new CargoMateria();
    }

    public Profesor(int profesor_id, String nombre, String apellido, CargoMateria cargoMateria) {
        this.profesor_id = profesor_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargoMateria = cargoMateria;
    }

    public int getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(int profesor_id) {
        this.profesor_id = profesor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public CargoMateria getCargoMateria() {
        return cargoMateria;
    }

    public void setCargoMateria(CargoMateria cargoMateria) {
        this.cargoMateria = cargoMateria;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "profesor_id=" + profesor_id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargoMateria=" + cargoMateria +
                '}';
    }
}