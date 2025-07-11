package Lab02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
 
        }
        
        System.out.println("Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        int[] maxResult = findMax(numbers);
        int[] minResult = findMin(numbers);
        
        System.out.println();
        System.out.println("Max value: " + maxResult[0] + ", at index: " + maxResult[1]);
        System.out.println("Min value: " + minResult[0] + ", at index: " + minResult[1]);
    }
    
    
    public static int[] findMax(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return new int[]{max, maxIndex};
    }
    
    
    public static int[] findMin(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return new int[]{min, minIndex};
    }
    
}
