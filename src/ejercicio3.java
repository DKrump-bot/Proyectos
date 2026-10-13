import javax.swing.*;
import java.util.Dictionary;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        float numero1;
        numero1 = inputValue.nextFloat();
        float numero2;
        inputValue = new Scanner(System.in);
        numero2 = inputValue.nextFloat();
        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;
        System.out.println("los resultadios son " );
        System.out.println("Suma " + suma);
        System.out.println("Resta " + resta);
        System.out.println("Multiplicacion " + multiplicacion);
        System.out.println("Division " + division);

    }
}
