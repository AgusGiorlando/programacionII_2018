import java.util.Arrays;

public class Implementacion1<T> implements MyList<T> {
    private T[] array;
    private int tamanio;

    public Implementacion1() {
        int tamanio = 5;
        this.array = (T[]) new Object[tamanio];
    }

    public void agregar(T elemento) {
        if (array[this.tamanio] != null){
            for (int i = 0; i < this.tamanio; i++) {
                if (array[i] == null) {
                    this.array[i] = elemento;
                    break;
                }
            }
            this.compactar();
        }else {
            this.aumentarTamanio(elemento);
        }
    }

    public void aumentarTamanio(T elemento){
        T[] tmpArray = (T[]) new Object[this.tamanio];
        System.arraycopy(array,0,tmpArray,0,array.length);
        this.tamanio += 5;
        T[] array = (T[]) new Object[this.tamanio];
        System.arraycopy(tmpArray,0,array,0,tmpArray.length);
        this.agregar(elemento);
    }

    public void compactar(){
        for (int i = 0; i < this.tamanio; i++) {
            if (array[i] == null){
                for (int j = i; j < this.tamanio; j++) {
                    if (array[j] != null){
                        array[i] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
        }
    }

    public T obtener(int posicion) {
        return this.array[posicion];
    }

    public void borrar(int posicion) {
        this.array[posicion] = null;
        this.compactar();
    }

    public void borrarTodos() {
        for (int i = 0; i < this.tamanio; i++) {
            this.array[i] = null;
        }
    }

    @Override
    public String toString() {
        return "Implementacion1{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
