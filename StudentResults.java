package DEMO;

import java.util.Scanner;

public class StudentResults {

	// Function to calculate grade based on average percentage
	
	public static String calculateGrade(double averagePercentage) {
		if (averagePercentage >= 90) {
			return "A";
		} else if (averagePercentage >= 80) {
			return "B";
		} else if (averagePercentage >= 70) {
			return "C";
		} else if (averagePercentage >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	

	// Function to calculate total marks and average percentage
	
	
	public static double[] calculateResults(int[] marks) {
		double totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark;
		}
		double averagePercentage = totalMarks / marks.length;
		return new double[] { totalMarks, averagePercentage };
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take input for the number of subjects
		System.out.print("Enter the number of subjects: ");
		int numberOfSubjects = scanner.nextInt();

		int[] marks = new int[numberOfSubjects];

		// Take input for marks in each subject
		
		for (int i = 0; i < numberOfSubjects; i++) {
			System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
			marks[i] = scanner.nextInt();
		}

		// Calculate results
		
		double[] results = calculateResults(marks);
		double totalMarks = results[0];
		double averagePercentage = results[1];
		String grade = calculateGrade(averagePercentage);

		// Display results
		
		System.out.println("\nResults:");
		System.out.println("Total Marks: " + totalMarks);
		System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
		System.out.println("Grade: " + grade);

		scanner.close();
	}
}
