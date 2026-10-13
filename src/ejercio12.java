import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class ejercio12 {
    public static void main(String[] args) {
        System.out.println("Introduce nota ");
        Scanner inputValue = new Scanner(System.in);
        double nota = inputValue.nextDouble();
        if (nota >= 0 && nota <3){
            System.out.println("My Deficiente");
        } else if (nota >= 3 && nota <5 ) {
            System.out.println("Insuficiente ");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Sufucuente");
        } else if (nota >=6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >=7 && nota < 9) {
            System.out.println("Notable");
        }else if (nota >= 9 && nota <=10){
            System.out.println("Sobresaliente");
        }else {
            System.out.println("nota invalida ");
        }
    }
}
