import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int primo=0,divisor,contador,contadora=0,num,entrada=0;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
        // De aquí en adelante vamos recorriendo numeros del 1 al introducido
        for (contador=1;contador<num1;contador++){

            num=contador;
            //TODO SE PODRÍA INVERTIR ESTE IF PARA QUE SEA MAS ESTETICO PERO FUNCIONA
            if (num==1||num==2){ // Si es 1 o 2 directamente ponemos que son primos
                primo=0;
            } else {
                entrada=1;
            }
            divisor=num;

            if (entrada==1){ // A partir de aquí se comprueba si son primos o no
                do {
                    contadora++;
                    divisor=divisor-1;
                    if(num%divisor==0){
                        primo=1;
                    }
                }while (contadora!=num && primo==0 && divisor!=2);
            }
            if (primo==0) {
                System.out.println(""+num);
            }
            primo=0;
            contadora=0;

        }

    }

}