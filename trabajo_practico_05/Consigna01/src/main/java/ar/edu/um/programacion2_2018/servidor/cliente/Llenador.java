package ar.edu.um.programacion2_2018.servidor.cliente;

public class Llenador extends Thread {
	private ColaCaja cola;
	private static int n = 1;
	private int numLlen;

	public Llenador() {
		numLlen = n++;		
	}

	public Llenador(ColaCaja cola) {
		super();
		this.cola = cola;
		numLlen = n++;
	}
	
	public ColaCaja getCola() {
		return cola;
	}

	public void setCola(ColaCaja cola) {
		this.cola = cola;
	}

	@Override
	public void run() {
		for (int i = 1 ; i <= 10 ; i++) {
			Producto prod1 = new Producto("Manteca",40);
			Cliente cl = new Cliente(i);
			cl.getProductos().add(prod1);
			this.cola.getClientes().add(cl);
		}
		System.out.println("Llenador " + this.numLlen + " terminado");
	}
}
