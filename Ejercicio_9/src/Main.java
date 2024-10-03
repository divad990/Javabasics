import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int contador = 3;
        byte numdefme = 99;
        byte numdefma = -1;

        while (contador != 0) {
           contador = contador - 1;

            byte num = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce a continuación un numero"));

           if (num < numdefme){
               numdefme = num;
           }
           if (num > numdefma) {
               numdefma = num;
           }
        }

        JOptionPane.showMessageDialog(null,"El numero mayor es:" + numdefma);
        JOptionPane.showMessageDialog(null,"El numero menor es:" + numdefme);

    }
}