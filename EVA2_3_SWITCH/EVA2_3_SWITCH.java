
package eva2_3_switch;

public class EVA2_3_SWITCH {

    public static void main(String[] args) {
        String valor = "Lunes";
        switch(valor){
            case "Lunes":
                System.out.println(1);
                break;
            case "Martes":
                System.out.println(2);
                break;
            case "Miercoles":
                System.out.println(3);
                break;  
            default:
                System.out.println("Valor incorrecto.");
        }
    }
    /*
    double valorDouble = 5.5;
    switch (valorDouble){//SOLO ACEPTA VALORES NUMEROS "INT"
        case 1.1;
            System.out.println("VALOR 1.1");
            break;
        case 5.5
            System.out.println("VALOR 5.5"); 
            break;
    */
}