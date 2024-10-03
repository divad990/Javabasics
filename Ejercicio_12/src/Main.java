import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        byte contador;
        byte aprobados = 0;
        byte alumnos = Byte.parseByte(JOptionPane.showInputDialog(null,"¿Cuantas notas quieres comprobar?"));

        for (contador=0;contador<alumnos;contador++){
            byte nota = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa la nota"));
            if (nota >= 6){
                aprobados++;
            }
        }

        /* CON ESTO IRIAMOS PASITO A PASITO SOLICITANDO, TENDRIAMOS QUE EJECUTAR EL RESTO DEL CODIGO
           EN BASE A ESTA PARTE, POR TANTO IRÍA POR DEBAJO

        String respuesta;
        do {
        respuesta = JOptionPane.showInputDialog(null,"¿Quieres continuar?");
        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

        */
        JOptionPane.showMessageDialog(null,"Numero de aprobados:"+aprobados);
    }
}