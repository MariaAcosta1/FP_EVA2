
package eva2_2_switch;

import java.util.Scanner;
public class EVA2_2_SWITCH {


    public static void main(String[] args) {
        //SWITCH --> OPCION MULTIPLE
        Scanner captu = new Scanner(System.in);
        int dia;
        System.out.println("Dia de la semana en número (1-7)");
        dia = captu.nextInt();
        /*if(dia == 1){
        System.out.println("Lunes");
        }else if(dia == 2){
        System.out.println("Martes");
        */
        switch(dia){//OPCIONES --> CASOS
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break; //fin de caso y de switch
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: //
                System.out.println("Número incorrecto.");
        }
    }
    
}
