/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.TPN5_consigna02;

import java.io.IOException;

public class AppCliente {

    public static void main(String[] args) throws IOException{  
        System.out.println("Inicia el cliente");
			
        Producto prod1 = new Producto("Manteca",40);

        Cliente cl = new Cliente(1);
        Cliente cl2 = new Cliente(2);
		cl.getProductos().add(prod1);
		cl2.getProductos().add(prod1);
	
		
		ColaCaja cola = new ColaCaja();		       
		//Llenador lle1 = new Llenador(cola);        
		//lle1.start();
		
		cola.getClientes().add(cl);
		cola.getClientes().add(cl2);
        cola.start();

        
    }
   
}