import java.util.Scanner;

public class ejercico6 {
    public static void main(String[] args) {
        System.out.println("Introduce tu edad");
        Scanner inputValue = new Scanner(System.in);
        int edad = inputValue.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad ");
        }else {
            System.out.println("Eres menor de edad ");
        }

    }
}
