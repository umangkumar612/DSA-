// WAP to take input 3 digit numbers from the user and print the square of the middle digit.
import java.util.Scanner;
public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a tree digit number");
        int number = sc.nextInt();
        if(number < 100 || number > 999){
            System.out.println("please enter valid input");
        }
        else {
            int mul = number /10;
            int mid = mul % 10;
            System.out.println("Square of the middle digit numbr "+ mid*mid);
        }
    }
}
