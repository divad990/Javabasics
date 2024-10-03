import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre");
        JOptionPane.showMessageDialog(null, "Hola " + nombre);
    }
}