/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.servidor.cliente;

import java.io.IOException;

public class AppCliente {

    public static void main(String[] args) throws IOException{  
        System.out.println("Inicia el cliente");
				
		ColaCaja cola = new ColaCaja();
		ColaCaja cola2 = new ColaCaja();
		ColaCaja cola3 = new ColaCaja();
		ColaCaja cola4 = new ColaCaja();
		ColaCaja cola5 = new ColaCaja();
		       
        Llenador lle1 = new Llenador(cola);
        Llenador lle2 = new Llenador(cola2);
        Llenador lle3 = new Llenador(cola3);
        Llenador lle4 = new Llenador(cola4);
        Llenador lle5 = new Llenador(cola5);
                
        lle1.start();
        lle2.start();
        lle3.start();
        lle4.start();
        lle5.start();
       
        cola.start();
        cola2.start();
        cola3.start();
        cola4.start();
        cola5.start();
        
    }
   
}