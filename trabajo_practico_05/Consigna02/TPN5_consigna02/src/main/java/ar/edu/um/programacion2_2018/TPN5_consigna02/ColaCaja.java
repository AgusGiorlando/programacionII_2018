package ar.edu.um.programacion2_2018.TPN5_consigna02;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;

public class ColaCaja extends Thread{
        
	private Queue<Cliente> clientes = new LinkedList<Cliente>();

	public ColaCaja() { 
		super(																																																																																													);
	}
	
	public Queue<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getCliente() {
		return clientes.poll();
	}

	public void setClientes(Queue<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void run() {
		System.out.println("Iniciando Cola");
		try {
		Socket s_cola = new Socket(InetAddress.getByName(null),	1234);
		ObjectOutputStream salida = new ObjectOutputStream(s_cola.getOutputStream());
		ObjectInputStream entrada = new ObjectInputStream (s_cola.getInputStream());
		while(true) {
			String mensaje = (String)entrada.readObject();
			salida.writeObject(this.getCliente());
			//System.out.println("Enviando cliente");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
