
package eva2_4_arreglos;

public class EVA2_4_ARREGLOS {

    public static void main(String[] args) {
        //NECESITAN CAPTURAR LOS DATOS DE UN GRUPO
        //ARREGLO --> estructura de datos
        //son identificador
        //secuencia (consecutiva) de valores del mismo tipo
        int[] arreglo;//crear el arreglo (basicamente decir su tamaño)
        arreglo = new int[10];//crear el arreglo
        //POSICIONES DE ELEMENTOS DE UN ARREGLO:
        //PRIMERO ELEMENTO --> 0 (CERO)
        //ULTIMO ELEMENTO --> TAMAÑO - 1
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
    }
    
}
