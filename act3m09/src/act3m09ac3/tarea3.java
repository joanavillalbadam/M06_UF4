/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3m09ac3;

import java.util.Random;


class tarea3 implements Runnable{

private String[] frases = {"Respirar és bo", "Petits tocs fan grans esquerdes", "El present és ara", "Arribo, veig i venço"};
 
public void run() {
Random r = new Random();
int valor = r.nextInt(frases.length);
 
System.out.println("Frase dels 5 seg: "+ frases[valor]);
}
}