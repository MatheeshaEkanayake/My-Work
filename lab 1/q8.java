import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1");
        int n1 = input.nextInt();
        System.out.println("Enter num 2");
        int n2 = input.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("New num 1 : "+n1);
        System.out.println("New num 2 : "+n2);

    }
}
