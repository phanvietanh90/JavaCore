package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

public class Collection {

	public static void main(String[] args) {
		// 
		Student s1 = new Student(101, "G", 23);
		Student s2 = new Student(104, "D", 21);
		Student s3 = new Student(103, "A", 25);
		Student s4 = new Student(106, "E", 25);
		Student s5 = new Student(105, "C", 27);
		Student s6 = new Student(102, "B", 22);
		// creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		 
		 Iterator<Student> itr=al.iterator();
		 while(itr.hasNext()){
		 Student st=(Student)itr.next();
		 System.out.println(st.rollno+" "+st.name+" "+st.age);
//		 if (st.rollno == 102) {
//				al.remove(st);
//			}
		 
		 }
//		System.out.println("befor remove:");
//		for (Student st : al) {
//
//			System.out.println(st.rollno + " " + st.name + " " + st.age);
//			if (st.rollno == 102) {
//				al.remove(st);
//			}
//
//		}
		 //Sap xep tang dan
		 Collections.sort(al);
		System.out.println("after remove:");
		for (Student st2 : al) {

			System.out.println(st2.rollno + " " + st2.name + " " + st2.age);

		}
		
		
		

	}
}
