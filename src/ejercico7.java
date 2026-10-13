import java.util.Scanner;

public class ejercico7 {
    public static void main(String[] args) {
        System.out.println("Introduce valor ");
        Scanner inputValue = new Scanner(System.in);
        double numero = inputValue.nextDouble();
        if (numero < 0){
            System.out.println("Numero negativo");
        }else {
            System.out.println("Numero positivo");
        }
    }
}
