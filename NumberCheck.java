import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        while (count<10) {
            System.out.println("Enter a number:");
            int num=sc.nextInt();
            if (num>=50) {
                break;
            }
            count++;
        }
        sc.close();
    }
}