 // WAP to check whether a number is even or odd.

 import java.util.Scanner;
 public class prob9 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number");
 
         int n = sc.nextInt();
 
         if(n % 2 == 0){
             System.out.println(n + " is even");
         }
         else {
             System.out.println(n + " is odd");
         }
     }
 }
 