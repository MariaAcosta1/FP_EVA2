
package eva2_10_for;

public class EVA2_10_FOR {


    public static void main(String[] args) {
        //imprimir del 1 al 20
        for(int i = 1; i <= 20; i++)
            System.out.print(i + " - ");
        
        for(int i = 20; i >= 1; i--)
            System.out.print(i + " - ");
        
        //IMPRIMIR LOS PARES DE 0 A 100
        //0 - 2 - 4 - 6 - 8 ... 98-100
        //+=, -=, *=, /=
        System.out.println("");
        for(int i = 0; i <= 100; i += 2)
            System.out.print(i + " - ");
        
        for(int i = 100; i >= 1; i -= 2)
            System.out.print(i + " - ");
    }       
}
