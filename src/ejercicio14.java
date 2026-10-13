import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Escriba su primer numero ");
        Scanner inputvalue = new Scanner(System.in);
        double numero1 = inputvalue.nextDouble();
        System.out.println("Escriba su segundo numero ");
        inputvalue = new Scanner(System.in);
        double numero2 = inputvalue.nextDouble();
        System.out.println("Ahora pon la operacion deseada (+,-,*,/)");
        String operacion = inputvalue.next();
        switch (operacion){
            case "+":
                System.out.println(numero1 + numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            case "/":
                System.out.println(numero1 / numero2);
                break;
            default:
                System.out.println("Introduzca un valor valido ");
        }

    }
}
