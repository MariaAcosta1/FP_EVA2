
package eva_12_tabla_mult;

import java.util.Scanner;

public class EVA_12_TABLA_MULT {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        System.out.println("Tabla de multiplicar: ");
        valor = input.nextInt();
        for(int i = 1; i <= 10; i++){
            int mult = valor * i;
            System.out.println(valor + " x " +i+ " = " + mult);
    }
    
}
}