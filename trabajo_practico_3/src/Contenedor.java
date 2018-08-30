
public class Contenedor<T> {
	private T objeto;
	private Contenedor<T> siguiente;
	
	public Contenedor(T objeto, Contenedor<T> siguiente) {
		this.objeto = objeto;
		this.siguiente = siguiente;
	}	

	public Contenedor() {

	}
	
	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}
	
	public Contenedor<T> getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Contenedor<T> siguiente) {
		this.siguiente = siguiente;
	}

	public T obtener() {
		return this.objeto;
	}	
	
	@Override
	public String toString() {
		return "[objeto=" + objeto + ", siguiente=" + siguiente + "]";
	}
	
}
