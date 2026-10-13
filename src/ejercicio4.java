import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        double PI = 3.14159;
        Scanner inputValue = new Scanner(System.in);
        double radio = inputValue.nextFloat();
        double area = 2*PI * radio;
        double altura = PI * radio * radio;
        System.out.println("Area = " + area);
        System.out.println("Altura = " + altura);
    }
}
