
package act3m09ac2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
 
public class Act3m092 {
 
 
 
 
public static void main(String[] args) throws InterruptedException, ExecutionException {
 
ExecutorService executor = (ExecutorService) Executors.newFixedThreadPool(4);
 
for (int i = 0; i < 3; i++) {
int inici=(i)*1000;
int fi=inici+1000;
tarea2 calculPrimers = new tarea2(inici,fi);
System.out.println(inici+"--"+fi);
executor.execute(calculPrimers);
}
 
executor.shutdown();
 
 
}
}
 