
package act3m09ac3;
 
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
 
public class Act3m093 {
 
 public static void main(String[] args) throws InterruptedException, ExecutionException { 
// crea un pool únic
 ScheduledExecutorService schExService = Executors.newSingleThreadScheduledExecutor();
// Crear objecte Runnable.
 Runnable ob = new Act3m093().new tarea3();
// Programa Fil, s'inicia immediatament 0 seg i després es va executant cada 5 segons
schExService.scheduleWithFixedDelay(ob, 0, 5, TimeUnit.SECONDS);
// Espera per acabar 60 segons
schExService.awaitTermination(60, TimeUnit.SECONDS);
// shutdown .
schExService.shutdownNow();
System.out.println("Completat");
}
// Fil Runnable

 
 
}