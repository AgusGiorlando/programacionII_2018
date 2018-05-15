package ar.edu.um.programacionII.TP4_Consigna01;

import java.util.ArrayList;
import java.util.List;

public class ColaCaja {
	private int numCaja;
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public ColaCaja() {
	}
	
	public ColaCaja(List<Cliente> clientes, int num) {
		super();
		this.clientes = clientes;
		this.numCaja = num;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public int getNumCaja() {
		return numCaja;
	}

	public void setNumCaja(int numCaja) {
		this.numCaja = numCaja;
	}

	public void add(Cliente cl) {
		clientes.add(cl);
	}
	
	public void procesar() throws InterruptedException {
		while(true) {
			for (int i = 0; i < clientes.size(); i++) {
				System.out.println("Caja " + this.numCaja + "->Cliente " + clientes.get(i).getNumCliente());
				clientes.get(i).procesar();
				clientes.remove(i);
			}
		}
	}
}
