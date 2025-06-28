package lab01;
import java.util.Scanner;
public class labprob2 {
    public static void main (String[] args)
    {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the number of minutes: ");
    int minute = input.nextInt();
    int year = minute / 525600;
    int remainingyear = minute - (525600*year);
    int day = remainingyear / 1440;
    
    System.out.println(minute + " is approximately " + year + " years " + "and " + day + " days");
     
    }
    
}
