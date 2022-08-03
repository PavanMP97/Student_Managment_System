package sdbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class StudentManagmentImpl implements StudentManagmentSystem {

	Student std;

	Scanner scan = new Scanner(System.in);
	Date d = new Date();

	LinkedHashMap<Integer, Student> db = new LinkedHashMap<Integer, Student>();

	@Override
	public void addStudent() {
		System.out.println("Enter ID: ");
		int id = scan.nextInt();
		System.out.println("Enter Name: ");
		String name = scan.next();
		System.out.println("Enter Age: ");
		int age = scan.nextInt();
		System.out.println("Enter Marks: ");
		double marks = scan.nextDouble();
		Student std = new Student(id, name, age, marks, d.toLocaleString());
		db.put(id, std);
		System.out.println("student Record Added Succesfully\n-------------------------------------------\n");
	}

	@Override
	public void removeStudent() {
		System.out.println("enter id to remove student");
		int id = scan.nextInt();
		if (db.containsKey(id)) {
			db.remove(id);
			System.out.println(id + "removed successfully");
		} else {
			try {
				throw new StudentNotFoundException("student not found \n");
			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("------------------------------------------\n");
	}

	@Override
	public void removeAllStudents() {
		db.clear();
		System.out.println("Students Record Deleted Sucessfully");
		System.out.println("------------------------------------------\n");
	}

	@Override
	public void DisplayStudent() {
		System.out.println("enter the id to get details");
		int id = scan.nextInt();
		if (db.containsKey(id)) {
			System.out.println(db.get(id) + "\n");
		} else {
			try {
				throw new StudentNotFoundException("student not fount");

			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("--------------------------------------------\n");
	}

	@Override
	public void DisplayAllStudents() {
		Set<Integer> s = db.keySet();
		for (int id : s) {
			System.out.println(db.get(id) + "\n");
		}
		System.out.println("-----------------------------------\n");

	}

	@Override
	public void UpdateStudent() {

		System.out.println("enetr student id : ");
		int id = scan.nextInt();
		if (db.containsKey(id)) {
			System.out.println("select the area to update:");
			System.out.println("1: name\n2: age\n3: marks");
			System.out.println("enter the choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the name");
				String name = scan.next();
				db.get(id).setName(name);
				System.out.println("Student name updated sucessfully");
				break;
			case 2:
				System.out.println("enter the age");
				int age = scan.nextInt();
				db.get(id).setAge(age);
				System.out.println("Student age updated sucessfully");
				break;
			case 3:
				System.out.println("enter the marks");
				double marks = scan.nextDouble();
				db.get(id).setMarks(marks);
				System.out.println("Student marks updated sucessfully");
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}
		} else {
			try {
				throw new StudentNotFoundException("student not fount");

			} catch (StudentNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("----------------------------------------------------");

	}

	@Override
	public void CountStudents() {
		System.out.println("The number of Student records Are: " + db.size());
		System.out.println("------------------------------------\n");
	}

	@Override
	public void sortStudents() {
		System.out.println("select the area to be sorted\n");
		System.out.println("1: name\n\n2: age\n\n3: marks\n");
		int choice = scan.nextInt();
		System.out.println("select the order of sorting\n");
		System.out.println("1: Ascending\n2: Decending\n");
		int choice2 = scan.nextInt();
		Set<Integer> i = db.keySet();
		ArrayList<Student> t1 = new ArrayList<>();
		for (int in : i) {
			t1.add(db.get(in));
		}
		switch (choice2) {
		case 1:

			switch (choice) {
			case 1:
//				TreeSet<Student> t1 = new TreeSet<Student>(new SortStudentNameByAscending());
//				for (int in : i) {
//					t1.add(db.get(in));
//				}
				Collections.sort(t1,new SortStudentNameByAscending());
				System.out.println(t1);
				break;
			case 2:
//				TreeSet<Student> t2 = new TreeSet<Student>(new SortStudentAgeBYAscending());
//				for (int in : i) {
//					t2.add(db.get(in));
//				}
				Collections.sort(t1,new SortStudentAgeBYAscending());
				System.out.println(t1);
				break;
			case 3:
//				TreeSet<Student> t3 = new TreeSet<Student>(new SortStudentMarksByAscending());
//				for (int in : i) {
//					t3.add(db.get(in));
//				}
				Collections.sort(t1,new SortStudentMarksByAscending());
				System.out.println(t1);
				break;
			default:
				System.out.println("enter valid choice");
			}
			break;
		case 2:
			switch (choice) {

			case 1:
//				TreeSet<Student> t1 = new TreeSet<Student>(new SortStudentNameByDescending());
//				for (int in : i) {
//					t1.add(db.get(in));
//				}
				Collections.sort(t1,new SortStudentNameByDescending());
				System.out.println(t1);
				break;
			case 2:
//				TreeSet<Student> t2 = new TreeSet<Student>(new SortStudentAgeByDescending());
//				for (int in : i) {
//					t2.add(db.get(in));
//				}
				Collections.sort(t1,new SortStudentAgeByDescending());
				System.out.println(t1);
				break;
			case 3:
//				TreeSet<Student> t3 = new TreeSet<Student>(new SortStudentMarksByDescending());
//				for (int in : i) {
//					t3.add(db.get(in));
//				}
				Collections.sort(t1,new SortStudentMarksByDescending());
				System.out.println(t1);
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}

		}

	}

}
