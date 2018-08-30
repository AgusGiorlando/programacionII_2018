public interface MyList<T> {
    public void agregar(T elemento);
    public T obtener(int posicion);
    public void borrar(int posicion);
    public void borrarTodos();
}
