import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        byte bucle=0;
        int numrand = (int) (Math.random()*100+1);

        do {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero"));

            if (numrand < num){
                JOptionPane.showMessageDialog(null,"El numero introducido es menor al generado");
            }else if(numrand > num){
                JOptionPane.showMessageDialog(null,"El numero introducido es mayor al generado");
            }else {
                JOptionPane.showMessageDialog(null,"¡Has acertado!");
                bucle=1;
            }
        }while (bucle!=1);

    }
}