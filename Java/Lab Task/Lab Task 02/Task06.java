package Lab02;

import java.util.Scanner;

public class Task06 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            names[i] = scanner.next();
            System.out.print("Enter student score: ");
            scores[i] = scanner.nextInt();
        }

        for (int i = 0; i < numStudents - 1; i++) {
            for (int j = i + 1; j < numStudents; j++) {
                if (scores[i] < scores[j]) {
                    int tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.print("Student names in decreasing order of their scores: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
    
}
