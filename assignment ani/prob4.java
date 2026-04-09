// WAP to take input rupees from the user and convert it into paise.

import java.util.*;

public class prob4 {
    public static long rupees(long n){
        return n*100;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rupees :");
    long n = sc.nextLong();
    System.out.println(n + " rupees in paisa is :" +rupees(n) );
 }   
}
