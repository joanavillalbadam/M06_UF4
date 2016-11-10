/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05uf3pract2;

import java.util.Scanner;

/**
 *
 * @author ALUMNEDAM
 */
public class M05Uf3Pract2 {

     Scanner lector = new Scanner (System.in);

    public String mostraMenu(){
       // Scanner lector = new Scanner (System.in);
    System.out.println("Seleccionar operació:"
    +"\n1.Afegeix"+" 2.Suprimeix" + "3. SuprimirTots"+"mira"+"Surt");
    return lector.nextLine();  
    }

    void mostrarmissatge(String incorectoo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
   
    

