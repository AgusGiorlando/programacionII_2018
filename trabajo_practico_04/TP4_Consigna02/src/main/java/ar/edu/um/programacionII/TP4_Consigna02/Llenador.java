package ar.edu.um.programacionII.TP4_Consigna02;

import java.util.ArrayList;
import java.util.List;

public class Llenador extends Thread {
	private ColaCaja cola;
	
	public Llenador() {
		
	}

	public Llenador(ColaCaja cola) {
		super();
		this.cola = cola;
	}
	
	@Override
	public void run() {
		for (int i=0 ; i < 10 ; i++) {
			Producto pr1 = new Producto("Manteca",40);
			Producto pr2 = new Producto("Sopa",20);
			List<Producto> prod = new ArrayList<Producto>();
			prod.add(pr1);
			prod.add(pr2);
			this.cola.add(new Cliente(prod,i));
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
