package ar.edu.um.programacion2_2018.servidor.cliente;

import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
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
			while(true) {
				try {
					salida.writeObject(this.getCliente());
				}catch (SocketException e) {
					break;
				}
			}
			s_cola.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
