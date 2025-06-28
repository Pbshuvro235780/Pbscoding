package lab01;
import java.util.Scanner;
public class labprob1 {
    public static void main (String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = input.nextInt();
     if (number % 2 == 0 && number % 3 == 0)
     {
        System.out.println("False");
     }
     else if (number % 2 != 0 && number % 3 == 0)
     {
        System.out.println("True");
     }
     else if (number % 2 == 0 && number % 3 != 0)
     {
        System.out.println("True");
     }
     else
     {
        System.out.println("False");
     }
    }
    
}
