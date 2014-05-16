/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

/**
 *
 * @author Jose Miguel
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N= 2;
        double A =5.8;
        char C ='b'; 
        
        double suma = N+A; 
        double resta = A-N; 
        
        
        
        System.out.println("El valor de N es: " + N );
        System.out.println("El valor de A es: " + A );
        System.out.println("El valor de C es: " + C );
        System.out.println("La suma de "+N + "+" + A +" es igual a:  " + suma );
        System.out.println("La diferencia de "+A + "-" + N +" es igual a:  " + resta );
        System.out.println("Valor numérico del carácter " + C + " = " + (int)C);
        
    }
    
}
