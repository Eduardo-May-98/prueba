package examen;
/*
Dado un entero con signo de 32 bits X, regresar ese entero con los dígitos al revés. 
En caso de que el valor resultante exceda 
el rango de valores de un entero con signo de 32 bits [-231, 231 - 1], regresar cero.
*/

import java.util.Scanner;

public class NumeroAlReves {
    int numero = 0, resto = 0; long invertido = 0;
    Scanner sc = new Scanner(System.in);
    
    //constructor nulo
    NumeroAlReves(){}
    
    public void invetirNumero(){
        
        System.out.println("El numero debe de estar entre un rado de: "+Integer.MAX_VALUE+" y "+Integer.MIN_VALUE);
       
        try{
            System.out.println("Digite un numero");
            numero = sc.nextInt();
            while(numero > 0 || numero < 0){
                resto = numero%10;
                invertido = invertido * 10 + resto;
                numero /=10;
            }
            
            System.out.println("El numero invertido es: "+invertido);
            
        }catch(Exception e){
        
            System.err.println("El numero ingreaso ha pasado la capacidad de un numero de 32 bits");
            invertido = 0;
            System.out.println("El numero invertido es: "+invertido);
            
        }
    }
    
    public static void main(String[] args) {
        NumeroAlReves obj = new NumeroAlReves();
        obj.invetirNumero();
    }

}
