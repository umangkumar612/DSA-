/*WAP to take input 3 numbers from the user and print the largest number among them.
using nested if 
using AND operator*/

import java.util.Scanner;
public class prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        // using AND operation
        if(a > b && a > c){
              System.out.println(a +"is the maximum number");
        }
        else if(b > a && b > c){
            System.out.println(b +"is the maximum number");
        }
        else if(b > a && b > c){
            System.out.println(b +"is the maximum number");
        }
        else if(c > a && c > b){
            System.out.println(c +"is the maximum number");
        }
        // using nested if 
        if( a > b){
            if(a > c){
                System.out.println(a +" is the maximum number");
            }
        }
        if( b > a){
            if(b > c){
                System.out.println(b +" is the maximum number");
            }
        }
        if( c > b){
            if(c > a){
                System.out.println(c +" is the maximum number");
            }
        }
    }
}
