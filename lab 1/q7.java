import java.util.Scanner;

public class q7{
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.println("Type your Celcius tempreture :");
        double tem = temp.nextDouble();
        double fah = (tem*1.8)+32;
        System.out.println("Your tempreture in Fahrenheit : "+fah);
    }
}