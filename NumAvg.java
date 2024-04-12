package com.tnsifDAY7;

import java.util.TreeSet;
import java.util.Scanner;

public class NumAvg {
    private TreeSet<Integer> numSet;

    public NumAvg() {
        this.numSet = new TreeSet<>();
    }

    public void addNum(int num) {
        if (num % 5 != 0 && num % 6 != 0) {
            numSet.add(num);
        }
    }

    public double calAvg() {
        if (numSet.isEmpty()) {
            return 0; // Return 0 if the set is empty
        }

        int sum = 0;
        for (int num : numSet) {
            sum += num;
        }
        return (double) sum / numSet.size();
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        NumAvg numAvg = new NumAvg();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Number");
            System.out.println("2. Find Average");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add: ");
                    int num = scanner.nextInt();
                    numAvg.addNum(num);
                    System.out.println("Number added successfully.");
                    break;
                case 2:
                    double avg = numAvg.calAvg();
                    if (avg == 0) {
                        System.out.println("The set is empty.");
                    } else {
                        System.out.println("Average: " + avg);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}
