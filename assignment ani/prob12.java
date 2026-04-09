// WAP to take input 2 numbers from the user and print their difference.
import java.util.Scanner;
public class prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = sc.nextInt();
        System.out.println("Enter second number");
        int m = sc.nextInt();
        int diff = n-m;
        System.out.println("difference is "+ diff);
    }
}
