
package act3m09ac1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Act3m09 {

  
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
    
        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
        data[i]= i;
        ThreadPoolExecutor executor;
        executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        List<tarea> llistaTasques2= new ArrayList<tarea>();
        List<tarea> llistaTasques3= new ArrayList<tarea>();

        for ( i = 0; i < 100; i++) {
        tarea calculaDivisor2 = new tarea(i,2);
        llistaTasques2.add(calculaDivisor2);
        tarea calculaDivisor3 = new tarea(i,3);
        llistaTasques3.add(calculaDivisor3);

        }
        List <Future<Boolean>> llistaResultats2;
        llistaResultats2 = executor.invokeAll(llistaTasques2);
        List <Future<Boolean>> llistaResultats3;
        llistaResultats3 = executor.invokeAll(llistaTasques3);

executor.shutdown();

          for (int x = 0; x < llistaResultats2.size(); x++) {
        Future<Boolean> resultat2 = llistaResultats2.get(x);
        Future<Boolean> resultat3 = llistaResultats3.get(x);
        try {
        if (resultat2.get() && resultat3.get())
        System.out.println("Número "+x+ " és divisible per 2 i per 3");
        //System.out.println("Número "+i+ " és divisible per 2 :" + resultat2.get() + " i divisible per 3: "+ resultat3.get());
        } catch (InterruptedException | ExecutionException e) {
        }
        }
    }
  
    }
}
