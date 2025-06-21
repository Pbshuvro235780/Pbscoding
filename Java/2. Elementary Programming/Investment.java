import java.util.Scanner;

class Investment 
{

    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter annual interest ratein percentage: ");
        double annualInterestRate = input.nextDouble();
        
        System.out.print("Enter number of years: ");
        int numberofYears = input.nextInt();
        
        double monthlyInterestRate = annualInterestRate /1200;
        
        double futureInvestmentValue = investmentAmount * Math.pow((1+monthlyInterestRate),(numberofYears * 12));
        
        System.out.printf("Accumulated value is $ %.2f", futureInvestmentValue );
        
        input.close();
    }
}
