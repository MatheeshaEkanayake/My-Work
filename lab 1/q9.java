import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner bmi = new Scanner(System.in);
         System.out.println("Enter Height in meters:");
        float h = bmi.nextFloat();
         System.out.println("Enter Weight in kilograms:");
        float w = bmi.nextFloat();
        float Bmi = w/(h*h);
         if(Bmi<18.5)
        {
            System.out.println("You are Underweight");
        }
        else if(18.5 <= Bmi && Bmi <= 24.9)
        {
            System.out.println("You are Normal");
        }
        else if(25 <= Bmi && Bmi <= 29.9)
        {
            System.out.println("You are Overweight");
        }
        else if(30 <= Bmi)
        {
            System.out.println("You are Obese");
        }
        
    }
}
