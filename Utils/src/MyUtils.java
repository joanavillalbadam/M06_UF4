

import java.util.Calendar;


public class MyUtils {
    

/**
 * 
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
       private static String sCadena = "Hola Mundo";
      private static String inverteix="";
      
      private static int dia = 10;
      private static int mes = 12;
      private static int año =1996;
      
    private static double factorial = 1;
    private static double numero=20;
      
     public static void main(String[] args) {
   
         inverteix(sCadena, inverteix);
         edat(dia,mes,año);
         factorial(numero);
     
     
     }
    public static String inverteix (String sCadena, String inverteix)
{
    
       for (int x=sCadena.length()-1;x>=0;x--)
    		inverteix = inverteix + sCadena.charAt(x);
    System.out.println(inverteix);
    String result = sCadena;
    return result;
}
/**
 * 
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 * 
 */
public static int edat (int dia, int mes, int año)
{
    Calendar cal = Calendar.getInstance();
    
     int diff_year = cal.get(Calendar.YEAR) - año;
        int diff_month = cal.get(Calendar.MONTH) - mes;
        int diff_day = cal.get(Calendar.DAY_OF_MONTH) - dia;

        //Si está en ese año pero todavía no los ha cumplido
        if (diff_month < 0 || (diff_month == 0 && diff_day < 0)) {
            diff_year = diff_year - 1; //no aparecían los dos guiones del postincremento :|
        }
        System.out.println(diff_year);
        return diff_year;

}

/**
 * 
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {
     while ( numero!=0) {
      factorial=factorial*numero;
      numero--;
  
    }
        System.out.println(factorial);
if (numero==0){
return 1;
}else{
double resultat = numero * factorial(numero-1);
System.out.println(factorial(40));
return resultat;
 
}

}
}
