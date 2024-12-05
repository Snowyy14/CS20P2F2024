package Mastery;

import java.util.Scanner;

public class CourseGrades {

    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook(12, 5); 
        
        gradeBook.getGrades(); 
        
        System.out.println("grades for the class: ");
        gradeBook.showGrades(); 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter a student number from 1 to 12 to get their average: ");
        int studentNumber = scanner.nextInt();
        
        System.out.print("the average grade for student " + studentNumber + " is: " + gradeBook.studentAvg(studentNumber - 1)); 
        System.out.print("%");
        
        System.out.print("enter a test number from 1-5 to get its average: ");
        int testNumber = scanner.nextInt();
        
        System.out.print("Average grade for test " + testNumber + " is: " + gradeBook.testAvg(testNumber - 1 ));
        System.out.print("%");
        
        
        scanner.close();
    }
}

class GradeBook {
	
	
    private int[][] grades;
    private int students;
    private int tests;

    public GradeBook(int students, int tests) {
        this.students = students;
        this.tests = tests;
        grades = new int[students][tests]; 
    }
    
    public void getGrades() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students; i++) { 
            System.out.println("enter grades for student " + (i + 1) + ": ");
            for (int j = 0; j < tests; j++) { 
                System.out.print("Test " + (j + 1) + ": ");
                
                
                
                grades[i][j] = scanner.nextInt(); 
       }
       }
    }
    


    public void showGrades() {
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": "); 
            for (int j = 0; j < tests; j++) {
                System.out.print(grades[i][j] + " "); 
            }
            System.out.println();
        }
    }

    public double studentAvg(int studentNumber) {
        if (studentNumber < 0 || studentNumber >= students) {
        	
            throw new IllegalArgumentException("not a student number");
        }
        int sum = 0;
        for (int j = 0; j < tests; j++) {
            sum += grades[studentNumber][j];
            
        }
        return (double) sum / tests; 
    }
    
    
    
    
    public double testAvg(int testNumber) {
        if (testNumber < 0 || testNumber >= tests) { 
        
      
            throw new IllegalArgumentException("Not a valid test number");
        }
        
        int sum = 0;
        for (int i = 0; i < students; i++) {
            sum += grades[i][testNumber]; 
        }
        return (double) sum / students; 
    }
}
