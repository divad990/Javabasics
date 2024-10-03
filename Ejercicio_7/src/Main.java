import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int cali = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la calificación"));

        while (cali > 10 || cali < 0) {
            cali = Integer.parseInt(JOptionPane.showInputDialog(null, "El numero no esta entre 0 y 10, por favor, introduce un numero entre esos."));
        }

        switch (cali) {
            case 1,2: JOptionPane.showMessageDialog(null, "Muy deficiente");
            break;
            case 3,4: JOptionPane.showMessageDialog(null, "Insuficiente");
            break;
            case 5: JOptionPane.showMessageDialog(null, "Suficiente");
            break;
            case 6,7: JOptionPane.showMessageDialog(null, "Bien");
            break;
            case 8,9: JOptionPane.showMessageDialog(null, "Notable");
            break;
            case 10: JOptionPane.showMessageDialog(null, "Sobresaliente");
            break;
            default: JOptionPane.showMessageDialog(null, "Error");
        }
    }
}