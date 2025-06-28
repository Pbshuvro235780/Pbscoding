package lab01;
import java.util.Scanner;
public class labprob3 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
    
        System.out.print("Enter a, b, c: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
    
            double d = b*b - 4*a*c;
    
            double r1 = (-b + Math.sqrt(d))/2*a;
            double r2 = (-b - Math.sqrt(d))/2*a;
    
        if (d > 0)
            {
                System.out.println("The equation has two roots: " + r1 + " and " + r2);
            }
        else if (d == 0)
            {
                System.out.println("The equation has same root: " + r1 + " and " + r2);
            }
        else 
            {
                System.out.println("The equation has no real roots.");
            }
    
    }    
}
