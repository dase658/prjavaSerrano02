/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

 *@author --> dase658@vidalibarraquer.net
 */
package prjava02;

import java.io.*;
import java.net.*;

/**
 *
 * @author --> Escriu el teu correu electrònic
 */
public class Prjava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("versió 0.1 del projecte prjava02"); 	
        try {
            InetAddress adreça = InetAddress.getLocalHost();
            String hostname = adreça.getHostName();
            System.out.println("hostname="+hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            System.out.println("Versió OS: " + System.getProperty("os.version"));
            System.out.println("Creació d'una branca del projecte prjavaSerrano02");
            System.out.println("Afegint mes codi al projecte prjavaSerrano02");
            System.out.println("Afegint mes codi a la branca 01");
            
            
        }
        catch (IOException e) {
		System.out.println("Exception occurred");
        }  
    }
}