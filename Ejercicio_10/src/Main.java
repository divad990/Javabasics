import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double minutos = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el numero de minutos gastado"));

        double descuento = 1.25/100;
        double total = 0;

        if (minutos < 300) {
            total = minutos * 0.04;
        } else if (minutos > 300 && minutos < 500) {
            total = minutos * 0.03;
        } else if (minutos > 500 && minutos < 800) {
            total = (300 * 0.03) + (minutos - 300) * 0.02;
        } else if (minutos > 800) {
            total = (300 * 0.03) + (minutos - 300) * 0.02 - descuento;
        }

        JOptionPane.showMessageDialog(null,"Tienes que pagar: " + total);

    }
}