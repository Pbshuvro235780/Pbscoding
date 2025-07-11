package Lab02;

import java.util.Scanner;

public class Task01 {
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int[] array = new int[number];   
        System.out.print("Enter " + number +" scores: ");
        for(int i=0; i < number; i++)
        {
            array[i] = input.nextInt(); 
        }
        int best = array[0];
        for(int i=0; i < number; i++)
        {
            
            if (array[i] > best)
            {
                best = array[i];
            }
        }
        for (int i=0; i<number; i++)
        {
            if (array[i]>=best-10)
            {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + "A");
            }
            
            else if (array[i]>=best-20)
            {
                System.out.println("Student " + i + " score is " + array[i] +  " and grade is " + "B");
            }
            
            else if (array[i]>=best-30)
            {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + "C");
            }
            
            else if (array[i]>=best-40)
            {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + "D");
            }
        
            else
            {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + "F"); 
            }    
        }
    }
    
}
