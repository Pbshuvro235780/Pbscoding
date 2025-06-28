package lab01;
import java.util.Scanner;
public class labprob5 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the center (p,q) and the radius (r) of a circle: ");
        double p = input.nextDouble();
        double q = input.nextDouble();
        double radius = input.nextDouble();
        
        System.out.print("Enter the point (x,y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        double a = Math.pow((p-x), 2);
        double b = Math.pow((q-y), 2);
        
        double r = Math.sqrt (a + b);
        
        if (radius >= r)
        {
         System.out.println("The point is inside in the circle.");
        }
        else
        {
         System.out.println("The point is outside in the circle.");
        }
    
    }
    
}
