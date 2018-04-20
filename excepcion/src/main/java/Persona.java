public class Persona {
    private int edad;

    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadMinimaException {
        if (edad < 20){
            throw new EdadMinimaException("No llega a 20 años");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }
}
