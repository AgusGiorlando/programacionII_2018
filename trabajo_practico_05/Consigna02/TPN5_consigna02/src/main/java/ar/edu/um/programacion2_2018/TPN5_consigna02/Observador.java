package ar.edu.um.programacion2_2018.TPN5_consigna02;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Observador  extends Thread{
	
	private Socket s_cola;
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	
	public Observador() {
		super();
	}
	
	public Observador(Socket sock) {
		super();
		this.s_cola = sock;
	}

	@Override
	public void run(){
		System.out.println("Observador iniciado");
		try {
			ObjectInputStream entrada = new ObjectInputStream (s_cola.getInputStream());
			ObjectOutputStream salida = new ObjectOutputStream(s_cola.getOutputStream());
    		Cajero cajero = new Cajero();
    		while (true) {
    				Cliente cli;
    				//Thread.sleep(1000);
    				String mensaje = "mandame un cliente";
    				System.out.println(mensaje);
    				salida.writeObject(mensaje);
    				cli = (Cliente)entrada.readObject();
    				cajero.atender(cli);
    		}

		} catch (IOException | ClassNotFoundException |InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}
}
