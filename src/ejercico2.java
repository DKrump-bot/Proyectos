import java.util.Scanner;
public class ejercico2 {
    public static void main(String[] args) {
        float lado;
        Scanner imputValue = new Scanner(System.in);

        System.out.println("Introduce el lado");
        lado = imputValue.nextFloat();

        imputValue.close();
        float area = lado * lado;
        System.out.println("tu lado mide " + lado);
        System.out.println("Tu area es " + area);

    }
}
