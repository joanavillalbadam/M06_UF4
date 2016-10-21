
package act3m09ac1;

import java.util.Calendar;
import java.util.concurrent.Callable;


      public class tarea implements Callable<Boolean> {
        private int numero;
        private int divisor;


    public tarea(int numero,int divisor ) {
        this.numero = numero;
        this.divisor = divisor;
    }
    @Override
    public Boolean call() throws Exception {
            if((numero%divisor)==0)
        return true;
        return false;

    }
    }
