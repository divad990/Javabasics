import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float pi = 3.14f;
        System.out.println("Introduce el radio");
        Scanner sc = new Scanner(System.in);
        int radio = sc.nextInt();
        float area = pi * radio * radio;
        System.out.println("El area del radio es: " + area);

    }
}