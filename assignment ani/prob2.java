// WAP to take input 1 number from the user and print its square and cube.

import java.util.Scanner;
public class prob2 { 
public static int square(int n){
    return n*n;
}
public static int cube(int n){
    return n*n*n;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        System.out.println("Square of the " + n + " is "+ square(n));

        System.out.println("cube of the " + n + " is "+ cube(n));

    }
    
}

