package Mastery;
import java.util.Scanner;
public class GroupAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try (Scanner userInput = new Scanner(System.in)) {
			 
			 Scanner scanner = new Scanner(System.in);
			 
		        //user input
		        System.out.print("Please enter first name: ");
		        String firstname = scanner.nextLine();
		
		        System.out.print("Please enter last name: ");
		        String lastname = scanner.nextLine();
		        			
		        char firstletter = lastname.toLowerCase().charAt(0);
		        
		        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		        
		        int index = 0;
		        
		        while (index < alphabet.length) {
		        	if (alphabet[index] == firstletter) { 
		        		switch(firstletter) {
		        		case 'a':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'b':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'c':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'd':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'e':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'f':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'g':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'h':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'i':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 1");
		        		break;
		        		case 'j':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'k':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'l':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'm':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'n':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'o':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'p':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'q':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 'r':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 's':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 2");
		        		break;
		        		case 't':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 3");
		        		break;
		        		case 'u':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 3");
		        		break;
		        		case 'v':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 3");
		        		break;
		        		case 'w':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 3");
		        		break;
		        		case 'x':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 3");
		        		break;
		        		case 'y':
		        		System.out.println(firstname + " " +lastname + " is assigned to Group 3");
		        		break;
		        		case 'z':
		        		System.out.println(firstname + " " + lastname + " is assigned to Group 3");
		        		break;
 		        		}
		        		break;
		        		
		        		
		        	}
		        	index++;
		        	
		        }
		        

		        

		}
	}

}
