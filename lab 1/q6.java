import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        int total=0;
        Scanner num = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the subject marks "+(i+1));
            int n=num.nextInt();
            total=total+n;
        }
        float pre=total/5;
        System.out.println("Your Total is : "+total);
        System.out.println("Your Percentage is : "+pre+"%");

    }
}
