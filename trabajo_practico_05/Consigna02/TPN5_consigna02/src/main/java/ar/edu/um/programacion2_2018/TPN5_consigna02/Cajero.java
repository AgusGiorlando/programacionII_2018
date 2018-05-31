/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.TPN5_consigna02;

public class Cajero extends Thread{
	private static int i = 1;
	private int numCaja;
	private boolean vacio;

	
	public Cajero() {
		numCaja = i++;
		vacio = true;
		System.out.println("Cajero " + this.numCaja + " iniciado");
	}
	
	public void atender(Cliente cli) throws InterruptedException {
		vacio = false;
		cli.procesar();
		vacio = true;
	}

	@Override
	public void run() {
		while(true) {
			if(this.vacio == true) {
				//pedir obj
			}
		}
	}
	
	
	
}
