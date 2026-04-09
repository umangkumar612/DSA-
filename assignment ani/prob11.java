// WAP to take input two numbers from the user and print the largest of them.
import java.util.Scanner;
public class prob11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        System.out.println("Enter the second number :");
        int m = sc.nextInt();

        if(n > m){
            System.out.println("the largest number is " + n);
        }
        else if(n < m){
            System.out.println("the largest number is "+ m);
        }
        else {
            System.out.println("both number is same ");
        }
    }
}
