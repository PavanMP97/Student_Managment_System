package sdbms;

import java.util.Scanner;

class Registration {
	static Scanner scan=new Scanner(System.in);
	static void register(StudentManagmentSystem obj) {
		while(true) {

			System.out.println("1: ADD STUDENT\n2: REMOVE STUDENT");
			System.out.println("3: REMOVE ALL STUDENT\n4: DISPLAY STUDENT");
			System.out.println("5: DISPLAY ALL STUDENT\n6: UPDATE STUDENT");
			System.out.println("7: COUNT STUDENT\n8: SORT STUDENT\n9: EXIT");
			System.out.println("------------------");
			System.out.println("ENTER THE CHOICE:");
			int choice=scan.nextInt();

			switch (choice) {
			case 1: 
				obj.addStudent();
				break;
			case 2: 
				obj.removeStudent();;
				break;
			case 3: 
				obj.removeAllStudents();;
				break;
			case 4: 
				obj.DisplayStudent();;
				break;
			case 5: 
				obj.DisplayAllStudents();;
				break;
			case 6: 
				obj.UpdateStudent();;
				break;
			case 7: 
				obj.CountStudents();;
				break;
			case 8: 
				obj.sortStudents();;
				break;
			case 9: 
				System.out.println("THANK YOU!!");
				System.exit(0);
				break;
			default:
				System.out.println("INVALID CHOICE PLEASE ENTER VALID CHOICE");
				register(obj);
			}

		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManagmentSystem obj=new StudentManagmentImpl();
		System.out.println("WELCOME TO SDBMS");
		System.out.println("----------------");
		register(obj);
	}
}

