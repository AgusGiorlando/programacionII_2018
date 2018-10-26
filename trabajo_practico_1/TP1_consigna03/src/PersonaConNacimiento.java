public class PersonaConNacimiento extends Persona {
    private Fecha nacimiento;

    public int getDia() {
        return nacimiento.getDia();
    }

    public void setDia(int dia) {
        nacimiento.setDia(dia);
    }

    public int getMes() {
        return nacimiento.getMes();
    }

    public void setMes(int mes) {
        nacimiento.setMes(mes);
    }

    public int getAnho() {
        return nacimiento.getAnho();
    }

    public void setAnho(int anho) {
        nacimiento.setAnho(anho);
    }

    @Override
    public void input() {
        nacimiento.input();
    }

    @Override
    public void show() {
        nacimiento.show();
    }

    @Override
    public String toString() {
        return nacimiento.toString();
    }
}
