package com.practice.programming;

class CourseOne implements Cloneable{
	
	String subject1;
	String subject2;
	String subject3;
	
	CourseOne(String subject1, String subject2,String subject3){
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class StudentOne implements Cloneable{
	
	int rno;
	String name;
	CourseOne courseOne;
	
	StudentOne(int rno,String name,CourseOne courseOne){
		this.rno=rno;
		this.name=name;
		this.courseOne=courseOne;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		
		StudentOne obj1=(StudentOne)super.clone();
		obj1.courseOne=(CourseOne) courseOne.clone();
		return obj1;
	}
}
public class ClonableExampleThree {
	
	public static void main(String[] args) throws Exception {
		
		CourseOne courseOne=new CourseOne("Maths","Physics","Chemistry");
		
		StudentOne studentOne=new StudentOne(3213,"Rajkumar",courseOne);
		
		StudentOne studentTwo=(StudentOne)studentOne.clone();
		
		System.out.println("studentTwo.courseOne.subject3--"+studentTwo.courseOne.subject3);
		System.out.println("studentOne.courseOne.subject3--"+studentOne.courseOne.subject3);
		studentOne.courseOne.subject3="CS";
		System.out.println("After Modified");
		System.out.println("studentTwo.courseOne.subject3--"+studentTwo.courseOne.subject3);
		System.out.println("studentOne.courseOne.subject3--"+studentOne.courseOne.subject3);
		
	}

}
