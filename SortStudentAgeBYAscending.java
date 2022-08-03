package sdbms;

import java.util.Comparator;

public class SortStudentAgeBYAscending implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.getAge().compareTo(s2.getAge());
	}

}
