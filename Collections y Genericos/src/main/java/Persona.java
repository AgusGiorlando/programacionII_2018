public class Persona implements Sumable {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void increment() {
        edad++;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }
}
