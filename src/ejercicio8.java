import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double numero1 = inputValue.nextDouble();
        inputValue = new Scanner(System.in);
        double numero2 = inputValue.nextDouble();
        if (numero1 > numero2){
            System.out.println("El numero " + numero1 + "es mayor que " + numero2);
        }else System.out.println("El numero " + numero2 + " es mayor que " + numero1);
    }
}
