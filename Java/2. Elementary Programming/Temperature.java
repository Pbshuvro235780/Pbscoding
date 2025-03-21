package Elementary_Programming;

import java.util.Scanner;

class Temperature 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double Celsius = scan.nextDouble();
        double Fahrenheit = (9.0/5) * Celsius + 32;
        System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
    }
}
