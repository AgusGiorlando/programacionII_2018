public class Monitor implements Sumable {
    private int pulgadas;

    public Monitor() {
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                '}';
    }

    public void increment() {
        pulgadas = pulgadas + 15;
    }
}
