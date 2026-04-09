// WAP to calculate and print area of circle and circumference of circle
import java.util.Scanner;

public class Circle{
    public static double Area(long radius){
        return Math.PI*radius*radius;
    }
    public static double circumference(long radius){
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radus of circle :");
        long r = sc.nextLong();
        System.out.println("area of circle is  :" + Area(r));
        System.out.println("circumference of circle is : "+ circumference(r));
    }
}
