import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        byte contador;
        int resultado=0;
        byte base = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce la base"));
        byte expon = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce el exopnente"));

        for (contador=0;contador<expon;contador++){
            resultado=base*base;
        }

        JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);

    }
}