
package eva2_13_numeros_pares;

import java.util.Scanner;

public class EVA2_13_NUMEROS_PARES {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Pon tu inicio: ");
        num1 = input.nextInt();
        System.out.println("Pon tu final: ");
        num2 = input.nextInt();
        
        System.out.println();
        for(int i = num1; i <= num2; i++){
            int resi = i % 2;
            if(resi == 0)
             System.out.print(i + " - ");  
    }
    
}
}