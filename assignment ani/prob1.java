// WAP to take input 2 numbers from the user and print the sum of the numbers.
import java.util.Scanner;
public class prob1{
    public static int sum(int a ,int b){
        return a+b;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the first numbers");
    int a = sc.nextInt();
    System.out.println("Enter the second number");
    int b = sc.nextInt();
    System.out.println("sum is :" + sum(a,b));
}
}