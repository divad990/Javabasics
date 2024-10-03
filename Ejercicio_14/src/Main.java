import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int contador = 10;
        byte numdefme = 99;
        byte numdefma = -1;
        String nombredef="";
        String nombredef2="";

        while (contador != 0) {
            contador = contador - 1;

            byte num = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce a continuación la calificación del alumno"));
            String nombre = JOptionPane.showInputDialog(null,"Introduce a continuación el nombre del alumno");

            if (num < numdefme){
                numdefme = num;
                nombredef = nombre;
            }
            if (num > numdefma) {
                numdefma = num;
                nombredef2 = nombre;
            }
        }

        JOptionPane.showMessageDialog(null,"La calificación mayor es: "+numdefma+" y ha sido obtenida por: "+nombredef2);
        JOptionPane.showMessageDialog(null,"La calificación menor es:"+numdefme+" y ha sido obtenida por: "+nombredef);

    }
}