package week1;

public class Student implements Comparable<Student> {
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }
	  
	public Student(String name) {
		super();
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		if (this.rollno> o.getRollno()){
			return 1;
		} else if (this.rollno < o.getRollno()){
			return -1;
		} else {
			return 0;
		}
	}  
	  
	  
}
