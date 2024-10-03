import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce a continuación el primer número");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Introduce a continuación el segundo número");
        int num2 = sc.nextInt();

        int resultado = num1 * num2;

        System.out.println("El resultado es: " + resultado);
    }
}