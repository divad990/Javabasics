import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la base"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la altura"));
        JOptionPane.showMessageDialog(null, "El perimetro es: " + (base*2 + altura *2));

    }
}