import java.util.Arrays;

public class Implementacion2<T> implements MyList<T> {
	private T[] array;
	private Contenedor<T> ultimo;

	@SuppressWarnings("unchecked")
	public Implementacion2() {
		this.array = (T[]) new Object[1];
		this.ultimo = null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void agregar(T elemento) {
		Contenedor<T> nuevo = new Contenedor<T>(elemento, this.ultimo);
		this.ultimo = nuevo;
		this.array[(array.length - 1)] = (T) nuevo;
		array = Arrays.copyOf(array, array.length + 1);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T obtener(int posicion) {
		return ((Contenedor<T>) this.array[posicion]).obtener();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void borrar(int posicion) {
		for (int i = posicion; i < array.length; i++) {
			((Contenedor<T>) this.array[posicion]).setObjeto(((Contenedor<T>) this.array[(posicion + 1)]).getObjeto());
		}
		this.array[array.length - 2] = null;
	}

	@Override
	public void borrarTodos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Array=" + Arrays.toString(array) + "\nTamaño=" + (this.array.length);
	}
    
}