package ar.edu.um.programacion2_2018.barrilete;

public class Perro implements Animal, Marca {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void caminar() {

    }

    public boolean comer(String alimento) {
        return false;
    }
}
