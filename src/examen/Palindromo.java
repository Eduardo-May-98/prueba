package examen;
import java.util.Scanner;
/*
Hacer una función que indique si un número con signo X es palíndromo o no.
Un número es palíndromo si es exactamente igual, aunque se lea al derecho o al revés. Por ejemplo, 696 es palíndromo 
mientras que 3456 no lo es.
*/
public class Palindromo {
    int numero = 0, resto = 0, aux = 0, invertido = 0;
    
    
    //Constructor nulo
    Palindromo(){}

    public void invertirNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        numero = sc.nextInt();
        aux=numero;
        
       while(aux > 0 || aux < 0){
                resto = aux%10;
                invertido = invertido * 10 + resto;
                aux /=10;
        }
        
        if(numero == invertido){
            System.out.println("El numero es palindromo");
        }else{
            System.out.println("El numero no es palindromo");
        }
    }


    public static void main(String[] args) {
        Palindromo obj = new Palindromo();
        obj.invertirNumero();
    }
}
