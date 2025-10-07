
package eva2_10_lista;

import java.util.Scanner;

public class EVA2_10_LISTA {

    public static void main(String[] args) {
        //SOLICITAR DOS NUMEROS AL USUARIO, IMPRIMIR LA LISTA
        //ENTRE ESOS NUMEROS
        //-3 Y 3 --> -3 -2 -1 0 1 2 3
        //EN ORDEN INVER5O
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Pon tu inicio: ");
        num1 = input.nextInt();
        System.out.println("Pon tu final: ");
        num2 = input.nextInt();
        
        System.out.println();
        for(int i = num1; i <= num2; i++)
            System.out.print(i + " - ");
        
        System.out.println();
        for(int i = num2; i >= num1; i--)
            System.out.print(i + " - ");
    }
    
}
