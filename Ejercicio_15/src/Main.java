public class Main {
    public static void main(String[] args) {
        byte contador;
        int num1=1,num2=1,num3=0;
        System.out.println(num1);
        System.out.println(num2);
        for (contador = 11;contador!=0;contador--) {
            num3=num1+num2;
            num2=num1;
            num1=num3;
            System.out.println(num3);
        }
    }
}