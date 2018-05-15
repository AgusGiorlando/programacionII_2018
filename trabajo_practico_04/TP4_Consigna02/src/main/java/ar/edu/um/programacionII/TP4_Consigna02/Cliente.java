package ar.edu.um.programacionII.TP4_Consigna02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	List<Producto> productos = new ArrayList<Producto>();
	private int numCliente;
	
	public Cliente() {
		
	}
	public Cliente(List<Producto> productos, int numCliente) {
		super();
		this.productos = productos;
		this.numCliente = numCliente;
	}

	public int getNumCliente() {
		return numCliente;
	}
	
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void add(Producto pr) {
		productos.add(pr);
	}
	
	public void procesar() throws InterruptedException {
		for (int i = 0; i < this.productos.size(); i++) {
			System.out.println("Cliente " + this.numCliente + "->Producto n:" + i);
			productos.get(i).procesar();
		}
	}
}
