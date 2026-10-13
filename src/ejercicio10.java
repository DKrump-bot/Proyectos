import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double numero1 = inputValue.nextDouble();
        inputValue = new Scanner(System.in);
        double numero2 = inputValue.nextDouble();
        if (numero1 > numero2){
            System.out.println("El mas grande es " + numero1);
        }else System.out.println("El mas grande es " + numero2);
    }
}
