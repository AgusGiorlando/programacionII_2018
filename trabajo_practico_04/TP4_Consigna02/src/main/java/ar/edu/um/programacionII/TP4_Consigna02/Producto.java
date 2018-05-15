package ar.edu.um.programacionII.TP4_Consigna02;

public class Producto {
	private String nombre;
	private double precio;
	private int demora = getRandomNumberInRange(100, 2500);
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void procesar() throws InterruptedException {
		System.out.println("Procesando: " + this.nombre + "->Demora: " + this.demora);
		Thread.sleep(demora);
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}
