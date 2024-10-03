import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // COMMENT EXAMPLE

        /*
        Long comment example
         */

        /**
         * Comment that is part of the documentation
         */

        // TODO EXAMPLE OF A TASK TO BE PERFORMED
        int n1,n2 = 3,n3; // Define nro as integer number
        int resultado;
        char letra; // Define letter as single character '
        String nombre; // Define nombre as a character string "
        boolean mayor; // Define mayor as a boolean
        float d = 3.1416f;

        n1 = 7;
        letra = 'c';
        mayor = true;

        final int IVA = 21; // final define the last variable data

        resultado = (n1 + n2)*3;

        /*

        Tipos de datos en Java:


            ENTEROS                              REALES                    CARACTERES                                       BOOLEAN
        byte: ocupa 8bits                  float: ocupa 32bits          char: solo un caracter
        short: ocupa 16 bits               double ocupa 64bits          String: cadena de caracteres (s mayuscula)
        int: ocupa 32 bits
        long: ocupa 64 bits

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();

       // System.out.println("Dime tu edad");
       // int edad = sc.nextInt();
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dime tu edad"));
        JOptionPane.showMessageDialog(null, "Hola " + nombre + " tienes " + edad + " años");

    }
}