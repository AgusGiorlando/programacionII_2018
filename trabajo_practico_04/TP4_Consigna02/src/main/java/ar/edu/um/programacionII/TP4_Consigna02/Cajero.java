package ar.edu.um.programacionII.TP4_Consigna02;

public class Cajero extends Thread{
	private ColaCaja cola;
	
	public Cajero() {
		
	}
	
	public Cajero(ColaCaja cola) {
		super();
		this.cola = cola;
	}

	@Override
	public void run() {
		try {
			this.cola.procesar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
