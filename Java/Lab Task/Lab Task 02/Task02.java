package Lab02;

import java.util.Scanner;

public class Task02 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[101];
        
        System.out.print("Enter the integers between 1 and 100 (enter 0 to end): ");
        int n = input.nextInt();
        
        while(n != 0){
            
            if(n >= 1 && n <= 100) {
               number[n]++;
            }
            else 
            {
               System.out.print("Invaild Input, Enter the integers between 1 and 100 (enter 0 to end): ");
            }
           
            
            n = input.nextInt();
      
        }
        
        for(int i = 1; i <= 100; i++) {
            if(number[i] > 0) {
                System.out.println(i + " occurs " + number[i] + " times");
            }
        }
    }
}

