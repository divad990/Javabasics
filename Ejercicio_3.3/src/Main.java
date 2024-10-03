import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primero numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo numero"));
        JOptionPane.showMessageDialog(null, "El resultado es: " + num1 * num2);
    }
}