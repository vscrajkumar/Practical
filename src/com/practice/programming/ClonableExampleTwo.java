package com.practice.programming;

class Course
{
	String subjectOne;
	String subjectTwo;
	String subjectThree;
	Course(String subjectOne,String subjectTwo,String subjectThree){
		this.subjectOne=subjectOne;
		this.subjectTwo=subjectTwo;
		this.subjectThree=subjectThree;
	}
}
class Student implements Cloneable{
	
	String name;
	int rollNo;
	Course course;
	
	Student(int rollNo,String name,Course course){
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}	
public class ClonableExampleTwo  {

	public static void main(String[] args) throws Exception {
		
		Course course=new Course("Maths","Physics","Chemistry");
		Student one=new Student(3213,"Rajkumar",course);
		
		Student two;
		two=(Student)one.clone();	
		System.out.println("just did clone()--"+one.equals(two));
		one.course.subjectOne="Practice";
		System.out.println("one.course.subjectOne--"+one.course.subjectOne);
		System.out.println("two.course.subjectOne--"+two.course.subjectOne);
	}
}
