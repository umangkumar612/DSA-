// WAP to check whether the number is positive, negative or zero.

import java.util.Scanner;
public class prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        if( n > 0){
            System.out.println(n +" is positive number");
        }
        else if(n == 0){
            System.out.println(n + " is zero");
        }
        else {
            System.out.println(n + " is negative number");
        }


    }
}
