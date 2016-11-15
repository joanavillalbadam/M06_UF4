/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m05uf3pract2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ALUMNEDAM
 */
public class Animales {
    
    private M05Uf3Pract2 intText;
    private Visitant visi;
    private vaca vaca;
    private cocodrilo coco;
    Scanner leer = new Scanner (System.in);

    public Animales(M05Uf3Pract2 intText, Visitant visi) {
        this.intText = intText;
        this.visi = visi;
        this.coco = coco;
        this.vaca = vaca;
    }
    
     public void respostaOpcioMenu(){
    while(true){
    String accio = intText.mostraMenu();
    
    switch(accio){
        case "1":
            afegir();
            break;
        case "2":
            Suprimir();
            break;
        case "3":
            SuprimirTots();
            break;
        case "4":
            Mirar();
            break;
        case "5":
            sortir();
            break;
        case "6":
            intText.mostrarmissatge("incorectoo");
    }
    
}
     }

    private void afegir() {
      
        System.out.println("Escull quin animal vols afegir");
        System.out.println("1.-cocodrils");
        System.out.println("2.-vacas");
      int x = leer.nextInt();
      if(x == 1){
       int m;
        m = this.coco.afegirvaca();
        System.out.println(m);
      }
      if(x == 2){
           int m;
        m = this.vaca.afegirvaca();
        System.out.println(m);
      }
     
    }

    private void Suprimir() {
      
     System.out.println("Escull quin animal vols suprimir");
        System.out.println("1.-cocodrils");
        System.out.println("2.-vacas");
  int x = leer.nextInt();
      if(x == 1){
       int m;
        m = this.coco.afegirvaca();
        System.out.println(m);
      }
      if(x == 2){
           int m;
        m = this.vaca.afegirvaca();
        System.out.println(m);
      }
    
    }

    private void SuprimirTots() {
       
    System.out.println("Escull quin tipus d'animals vols suprimir");
        System.out.println("1.-cocodrils");
        System.out.println("2.-vacas");
        leer.nextInt();
    }

    public void Mirar() {
     
    int x;
    Random numAleatorio;
    numAleatorio = new Random();
    x = numAleatorio.nextInt(4);
    if( x == 0){
        String m;
        m = this.visi.miravacas();
        System.out.println(m);
    }
    if(x == 1){
    String m;
        m = this.visi.miracocodril();
        System.out.println(m);
    }
    if( x == 2){
    numAleatorio = new Random();
    int L = numAleatorio.nextInt(4);
            if(L == 0){
             String m;
        m = this.vaca.esmou();
        System.out.println(m);
            }
            if(L == 1){
            String m;
        m = this.vaca.expresa();
        System.out.println(m);
            }
            if(L == 2){
            String m;
        m = this.vaca.menja();
        System.out.println(m);
            }      
    }
    
    if(x == 3){
    numAleatorio = new Random();
    int L = numAleatorio.nextInt(4);
            if(L == 0){
             String m;
        m = this.coco.esmou();
        System.out.println(m);
            }
            if(L == 1){
            String m;
        m = this.coco.expresa();
        System.out.println(m);
            }
            if(L == 2){
            String m;
        m = this.coco.menja();
        System.out.println(m);
            }
    }
    }

    private void sortir() {
    System.exit(0); 
    }
}
