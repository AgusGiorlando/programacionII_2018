import java.util.Arrays;

public class Implementacion1<T> implements MyList<T> {
    private T[] array;
    int tamanio = 5;

    @SuppressWarnings("unchecked")
	public Implementacion1() {
        this.array = (T[]) new Object[5];
    }

    public void agregar(T elemento) {
    	if(array[(array.length -1)] == null) {
            for (int i = 0; i <= (array.length -1); i++) {
                if (array[i] == null) {
                    this.array[i] = elemento;
                    break;
                }
            }
    	}else {
			this.aumentarTamanio(elemento);
		}
    }

    public void aumentarTamanio(T elemento){
    	array = Arrays.copyOf(array, array.length + 5);
    	this.agregar(elemento);
    }
    
    public void compactar(){
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == null){
                for (int j = i; j < (array.length - 1); j++) {
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
        for (int i = 0; i < (array.length - 1); i++) {
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
