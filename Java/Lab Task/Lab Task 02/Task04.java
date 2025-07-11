package Lab02;

import java.util.Scanner;

public class Task04 {
    public static boolean isDistinct(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] distinctNumbers = new int[10]; 
        int distinctCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            if (isDistinct(distinctNumbers, distinctCount, numbers[i])) {
                distinctNumbers[distinctCount] = numbers[i];
                distinctCount++;
            }
        }

        
        System.out.println("Number of distinct numbers: " + distinctCount);
        System.out.print("Distinct numbers:");

        for (int i = 0; i < distinctCount; i++) {
            System.out.print(" " + distinctNumbers[i]);
        }
        System.out.println();
    }
    
}
