public class Sumador<T extends Sumable>{
    public void incrementar(T value) {
        value.increment();
    }
}
