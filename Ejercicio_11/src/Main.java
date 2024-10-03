import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int contadorapto=0;

        for (int contador=0;contador<3;contador++){
            double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el peso del alumno"));
            byte edad = Byte.parseByte(JOptionPane.showInputDialog(null,"Introduce la edad del alumno"));
            String nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del alumno");
            String sexo = JOptionPane.showInputDialog(null,"Introduce el sexo del alumno (H/M)");
            double estatura = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la estatura del alumno"));

            double apto = 1;

            if(sexo.equals("H")){
                if(estatura<=1.70){
                    apto=0;
                }else if(peso<=70){
                    apto=0;
                }
            }else if(sexo.equals("M")){
                if(estatura<=1.60){
                    apto=0;
                }else if(peso<=60){
                    apto=0;
                }else{JOptionPane.showMessageDialog(null,"Ha ocurrido un error");}
            }

            if(apto==1){
                contadorapto=contadorapto+1;
            }
        }
        JOptionPane.showMessageDialog(null,"La cantidad de alumnos aptos es de: "+contadorapto);
    }
}