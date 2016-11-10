/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05uf3pract2;

/**
 *
 * @author ALUMNEDAM
 */
public class vaca {
    
    int vaca = 7;
    
    public int Eliminarvaca(){
    vaca = vaca -1;
    return vaca;
    }
    
    public int Eliminartodasvaca(){
    vaca = 0;
    return vaca;
    }
    
    public int afegirvaca(){
    vaca = vaca +1;
    return vaca;
    }
    
    public String menja(){
        String missatge = "Una vaca menja al costat de una altra vaca";
    return missatge; 
    }
    public String expresa(){
    String missatge = "una vaca fa muu!";
    return missatge; 
    }
    public String esmou(){
        String missatge = "Una vaca es posa a dormir";
    return missatge; 
    }
}
