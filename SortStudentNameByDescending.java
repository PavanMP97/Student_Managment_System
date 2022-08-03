package sdbms;

import java.util.Comparator;

public class SortStudentNameByDescending implements Comparator<Student> {
	public int compare(Student s1,Student s2) {
		return s2.getName().compareTo(s1.getName());
	}
	
}
