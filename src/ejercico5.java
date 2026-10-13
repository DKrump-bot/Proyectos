import java.util.Scanner;

public class ejercico5 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduzca valor inicial");
        double precioInicial = inputValue.nextDouble();
        System.out.println("Introduzca valor rebajado ");
        inputValue = new Scanner(System.in);
        double precioRebajado = inputValue.nextDouble();
        double Descuento = (precioInicial-precioRebajado) / precioInicial * 100;
        System.out.println("Tu descuento es del " + Descuento + "%");

    }
}
