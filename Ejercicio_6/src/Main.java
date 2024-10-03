import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int cali = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la calificación"));

        while (cali > 10 || cali < 0) {
            cali = Integer.parseInt(JOptionPane.showInputDialog(null, "El numero no esta entre 0 y 10, por favor, introduce un numero entre esos."));
        }

        if (cali >= 5) {
            JOptionPane.showMessageDialog(null, "Es un aprobado!");
        } else {
            JOptionPane.showMessageDialog(null, "Es un suspendido");
        }


    }
}