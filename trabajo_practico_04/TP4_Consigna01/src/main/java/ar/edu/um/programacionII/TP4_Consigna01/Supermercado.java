package ar.edu.um.programacionII.TP4_Consigna01;

public class Supermercado {
	
	public Supermercado() {
		
	}

	public static void main(String[] args) {
				
		//COLAS
		ColaCaja cola1 = new ColaCaja();
		ColaCaja cola2 = new ColaCaja();
		
		//CAJEROS
		Cajero cjero1 = new Cajero(cola1);
		Cajero cjero2 = new Cajero(cola2);
		Cajero cjero3 = new Cajero();
		Cajero cjero4 = new Cajero();
		Cajero cjero5 = new Cajero();
		
		//LLENADORES
		Llenador llen1 = new Llenador(cola1);
		Llenador llen2 = new Llenador(cola2);
		
		cola1.setNumCaja(1);
		cola2.setNumCaja(2);
		
		cjero1.start();
		cjero2.start();
		llen1.start();
		llen2.start();

	}

}