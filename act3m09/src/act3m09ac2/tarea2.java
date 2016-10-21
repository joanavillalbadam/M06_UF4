/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act3m09ac2;

/**
 *
 * @author ALUMNEDAM
 */
public class tarea2 implements Runnable{
 
private int inici,fi;
public tarea2(int inici,int fi) {
this.inici = inici;
this.fi=fi;
}
 
@Override
public void run() {
int aux;
 
for(int numAnalitzar=inici;numAnalitzar<fi;numAnalitzar++){
boolean esPrimo=true;
for(int cont=2;cont<numAnalitzar;cont++)
{
aux=numAnalitzar%cont;
if(aux==0){
cont=numAnalitzar;
esPrimo=false;
}
}
if (esPrimo)
System.out.println(numAnalitzar + " és primer.");
}
 
}
    }

