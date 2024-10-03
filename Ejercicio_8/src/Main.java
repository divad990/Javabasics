import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        byte num = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce un numero ente el 1 y el 7"));

        while (num < 1 || num > 7) {
            num = Byte.parseByte(JOptionPane.showInputDialog(null,"El numero que has introducido no esta entre 1 y 7, por favor, vuelve a intentarlo:"));
        }

        switch (num) {
            case 1: JOptionPane.showMessageDialog(null,"Es lunes");
            break;
            case 2: JOptionPane.showMessageDialog(null,"Es martes");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Es miercoles");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Es jueves");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Es viernes");
            break;
            case 6: JOptionPane.showMessageDialog(null,"Es sabado");
            break;
            case 7: JOptionPane.showMessageDialog(null,"Es domingo");
            break;
        }
    }
}