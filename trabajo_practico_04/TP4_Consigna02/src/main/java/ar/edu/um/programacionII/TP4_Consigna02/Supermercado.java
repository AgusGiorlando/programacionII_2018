package ar.edu.um.programacionII.TP4_Consigna02;

public class Supermercado {

	public static void main(String[] args) {
				
		//COLAS
		ColaCaja cola1 = new ColaCaja();
		
		//CAJEROS
		Cajero cjero1 = new Cajero(cola1);
		Cajero cjero2 = new Cajero(cola1);
		Cajero cjero3 = new Cajero();
		Cajero cjero4 = new Cajero();
		Cajero cjero5 = new Cajero();
		
		//LLENADORES
		Llenador llen1 = new Llenador(cola1);
		
		cola1.setNumCaja(1);

		llen1.start();
		cjero1.start();
		cjero2.start();
	}

}
