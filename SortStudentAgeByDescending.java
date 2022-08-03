package sdbms;

import java.util.Comparator;

public class SortStudentAgeByDescending implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s2.getAge().compareTo(s1.getAge());
	}

}
