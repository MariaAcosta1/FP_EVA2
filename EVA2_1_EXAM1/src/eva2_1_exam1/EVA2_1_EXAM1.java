
package eva2_1_exam1;

import java.util.Scanner;

public class EVA2_1_EXAM1 {


    public static void main(String[] args) {
        int nat, cicli, carr;
        int tiempoT;
        Scanner input = new Scanner(System.in);
        System.out.println("Tiempo de natación: ");
        nat = input.nextInt();
        System.out.println("Tiempo de ciclismo: ");
        cicli = input.nextInt();
        System.out.println("Tiempo de carrera: ");
        carr = input.nextInt();
        
        tiempoT = nat + cicli + carr;
        if((tiempoT < 120) && ((nat < 60) && (cicli < 60) && (carr < 60)))
            System.out.println("Excelente!");
        else if((tiempoT < 150) && ((nat < 70) && (cicli < 70) && (carr < 70))){
            System.out.println("Buena!");
        } else {
                 System.out.println("Regular");}    
    }
    
}
