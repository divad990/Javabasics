import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int primo=0;
        int contador=0;
        int divisor;
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdcue un numero"));
        if (num==1||num==2){
            num=5;
        }
        divisor=num;
        do {
            contador++;
            divisor=divisor-1;
            if(num%divisor==0){
                primo=1;
            }
        }while (contador!=num && primo==0 && divisor!=2);

        if (primo==1) {
            JOptionPane.showMessageDialog(null,"El numero no es primo");
        } else {
            JOptionPane.showMessageDialog(null,"El numero es primo");
        }

    }
}