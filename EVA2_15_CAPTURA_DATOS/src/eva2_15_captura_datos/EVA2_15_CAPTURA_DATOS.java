
package eva2_15_captura_datos;

import java.util.Scanner;

public class EVA2_15_CAPTURA_DATOS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tama;
        System.out.println("¿Cuantás calificaciones quiere capturar?");
        tama = input.nextInt();
        int califas[] = new int[tama];
        for(int i = 0; i < califas.length; i++){
            System.out.println("Calificación #" + (i + 1) + ":");
            califas[i] = input.nextInt();
        }
        //lectura
        System.out.println();
        for(int i = 0; i < califas.length; i++){
            System.out.print("[" + califas[i] + "]");
    }
        //Promedio del grupo
        //SUMAR TODAS LAS CALIFICACIONES
        int sumaCalifas = 0;
        for(int i = 0; i < califas.length; i++){
            sumaCalifas = sumaCalifas + califas[i];
            //sumaCalifas += califas[i];        
    }
        System.out.println("acumulado = " + sumaCalifas);
        double promedio = sumaCalifas / califas.length;
        System.out.println("Promedio " + promedio);
}
}