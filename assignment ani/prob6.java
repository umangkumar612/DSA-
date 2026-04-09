//WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
import java.util.*;
public class prob6 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          System.out.println("Enter a three digit number :");
        int number = sc.nextInt();
        if(number < 100 || number > 999){
            System.out.println("invalid number");
        }
        else {
            int firstnum = number/100;
            int thirdnum = number % 10;
             int sum = firstnum + thirdnum;
              System.out.println("the sum of first and third number is " + sum);
        }
       
    }
}

