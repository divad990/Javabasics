import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int radio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el radio"));
        float pi = 3.14f;
        JOptionPane.showMessageDialog(null, "El radio es: " + (pi *  radio * radio));
    }
}