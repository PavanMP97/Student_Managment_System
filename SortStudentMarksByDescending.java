package sdbms;

import java.util.Comparator;

public class SortStudentMarksByDescending implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s2.getMarks().compareTo(s1.getMarks());
	}

}
