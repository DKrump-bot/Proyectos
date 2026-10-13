import java.util.Scanner;

public class ejercico9 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double numero1 = inputValue.nextDouble();
        inputValue = new Scanner(System.in);
        double numero2 = inputValue.nextDouble();
        if (numero1 < numero2){
            System.out.println("El numero " + numero1 + " es menor que " + numero2);
        }else System.out.println("El numero " + numero2 + " es menor que " + numero1);
    }
}
