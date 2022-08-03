package sdbms;

public class Student {
	private  int id;
	private  String name;
	private  int age;
	private String date;
	private  double marks; 
	
	
	public Student(int id, String name, int age, double marks,String date) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.date=date;
	}
	
	@Override
	public String toString() {
		return "ID=" + id + "\tname=" + name + "\tage=" + age + "\tmarks=" + marks+"\tDate="+date+"\n";
	}
	public String getDate() {
		return date;
	}

//	public void setDate(String date) {
//		this.date = date;
//	}

	public  int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	 public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public  Double getMarks() {
		return marks;
	}
	public  void setMarks(double marks) {
		this.marks = marks;
	}


}
