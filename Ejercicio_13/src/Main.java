import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        byte nota = 0;
        byte nota2;
        int suma=0,resultado=0;
        byte alumnos = Byte.parseByte(JOptionPane.showInputDialog(null,"¿Cuantos alumnos quieres comparar?"));
        byte contador = alumnos;
        do {
            contador--;
            nota2 = nota;
            nota = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce la nota del alumno"));

            suma = suma + nota;

        }while(contador!=0);
        resultado = suma/alumnos;
        JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);

    }
}