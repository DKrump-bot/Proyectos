import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Seleccione opcion ");
        System.out.println("opcion 1 ascendente ");
        System.out.println("opcion 2 descendente ");
        Scanner inputValue = new Scanner(System.in);
        int opcion = inputValue.nextInt();
        System.out.println("introduce primer numero ");
        inputValue = new Scanner(System.in);
        double Numero1 = inputValue.nextDouble();
        System.out.println("introduce segundo numero ");
        inputValue = new Scanner(System.in);
        double Numero2 = inputValue.nextDouble();
        if (opcion == 1) {
            if (Numero1 > Numero2){
                System.out.println("El numero " + Numero1 + " es mayor que " + Numero2);
            }else System.out.println("El numero " + Numero2 + " es mayor que " + Numero1);
        } else if (opcion == 2) {
            if (Numero1 < Numero2){
                System.out.println("El numero " + Numero1 + " es menor que " + Numero2);
            }else System.out.println("El numero " + Numero2 + " es menor que " + Numero1);

        }else {
            System.out.println("Error introduzca una opcion valida ");
        }
    }
}
