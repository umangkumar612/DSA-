// WAP to take input 4 digit numbers from the user and print its all digits.
import java.util.Scanner;

public class prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a four digit number");
        int n = sc.nextInt();
        if(n < 1000 || n > 9999){
            System.out.println("please enter a valid number ");
        }
        else {
            int first = n /1000;
            int second = (n /100)%10;
            int third = (n / 10)%10;
            int four = n %10;
            System.out.println("first digit is "+ first);
            System.out.println("second digit is "+ second);
            System.out.println("third digit is "+ third);
            System.out.println("four digit is "+ four);
        }
    }
}
