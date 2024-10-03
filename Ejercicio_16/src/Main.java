import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int ini=1,res1,cnt,res2=0,iniant=0;
        byte num=Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa el numero"));

        //suma desde el 1 (num*2 veces) todos los impares

        for (cnt=1;cnt<=num*2;cnt++){
            res1=ini+iniant;
            iniant=res1;
            if (res1%2!=0) {
                res2 = res2 + res1; //Sumamos impares
            }
        }

        System.out.println(res2);

    }
}