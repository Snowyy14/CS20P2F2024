package Mastery;

import java.util.Scanner;


public class CourseGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GradeBook gradeBook = new GradeBook(12,5);
		
		gradeBook.getGrades();
		
		
		System.out.print("Grades for the class: "+ gradeBook.showGrades());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a student number from 1-12 to get their average: ");
		int studentNumber = scanner.nextInt();
		
		System.out.print("Average grade for the " + studentNumber + "th student is: " + gradeBook.studentAvg(studentNumber - 1)); 
		
		
		System.out.print("Enter a test number 1-5 to get the average: " ); 
		int testNumber = scanner.nextInt();
		System.out.println("Average grade for the " + testNumber + "th test is: " + gradeBook.testAvg(testNumber - 1));
		
		scanner.close();
		
		
		
	}

}

	public class GradeBook { 
		private int[][] grades;
		private int students;
		private int tests;
		
		public void getGrades() {
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < students; i++) { 
				System.out.println("Enter grades for student " + (i + 1) + ": ");
				for (int j = 0; j < students; j++) { 
					System.out.println("test " + (j + 1) + ": ");
					grades[i][i] = scanner.nextInt();
				}
			}
		}
	}

	
	public void showGrades() {
		for (int i=0; i < students; i++) {
			System.out.print("Student " + (i + 2) + "; ");
			for (int j = 0; j < tests j++); {
				System.out.println("")
			}
		}
	}






