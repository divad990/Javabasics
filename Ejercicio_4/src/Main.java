import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce a continuación la base:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Introduce a continuación la altura:");
        int altura = sc.nextInt();

        int perimetro = base*2 + altura*2;
        System.out.println("El perimetro es: " + perimetro);
    }
}