package lab01;
import java.util.Scanner;
public class labprob4 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        double USD, BDT;
        System.out.println("The exchange rate");
        System.out.println("0 - from USD to BDT");
        System.out.println("1 - from BDT to USD");
        System.out.println("Enter the number (0 or 1): ");
        int number = input.nextInt();
        
        switch(number)
        {
            case 0: {
                System.out.print("Enter currency in U.S. dollars (USD):$");
                USD = input.nextDouble();
                BDT = 109.50 * USD;
                System.out.println("$" + USD + " in" + " BDT:" + "Tk." + BDT);
            }
            break;   
            case 1: {
                System.out.print("Enter currency in Bangladeshi Taka (BDT):Tk.");
                BDT = input.nextDouble();
                USD = 0.0091 * BDT;
                System.out.println(BDT + " BDT" + " in" + " USD:" + "$" + USD);
            }
            break;    
            default: System.out.println("Invaild Input.");
        }
    }
}

