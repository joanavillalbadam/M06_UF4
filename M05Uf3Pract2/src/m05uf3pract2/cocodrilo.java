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
public class cocodrilo {
    
    int coco = 7;
    
    public int Eliminarvaca(){
    coco = coco -1;
    return coco;
    }
    
    public int Eliminartodasvaca(){
    coco = 0;
    return coco;
    }
    
    public int afegirvaca(){
    coco = coco +1;
    return coco;
    }
    
    public String menja(){
        String missatge = "Una cocodril s'ha menjat una vaca";
    return missatge; 
    }
    public String expresa(){
    String missatge = "un cocodril obre una voca plena de dents";
    return missatge; 
    }
    public String esmou(){
        String missatge = "Un cocodril neda estany amunt, estany avall";
    return missatge; 
    }
}
