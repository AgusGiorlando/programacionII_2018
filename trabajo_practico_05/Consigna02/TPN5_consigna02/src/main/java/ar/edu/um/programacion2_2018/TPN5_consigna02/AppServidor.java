/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.um.programacion2_2018.TPN5_consigna02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServidor {
	
	public AppServidor() {
		
	}
    
	public static void main(String[] args) throws IOException {
		ServerSocket s_serv = null;	
        System.out.println("Servidor iniciado");        
        try {
        	s_serv = new ServerSocket(1234);
       		Socket s_Cola = s_serv.accept();
       		System.out.println("Cola Aceptada");
       		Observador obs = new Observador(s_Cola);
       		obs.start();
        }catch (IOException e) {
			e.printStackTrace();
        }
    }
}
