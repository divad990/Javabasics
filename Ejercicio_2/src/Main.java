import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " ");
        sc.close();
    }
}