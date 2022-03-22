package com.training.assessment;

public class Student {
		
		String name;
		int marks;
		int roll;
		
		Student(String name,int marks,int roll){
			this.marks=marks;
			this.name=name;
			this.roll=roll;
		}
		boolean isEqual(Object o1,Object o2)
		{
			if(o1.equals(o2))
				return true;
			else
			{
				Student s1=(Student) o1;
				Student s2=(Student) o2;
//				return s1.roll==s2.roll && s1.name.equals(s2.name) && s1.marks==s2.marks;
				return s1.roll==s2.roll && s1.marks==s2.marks;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student a=new Student("Ravi",100,170);
			Student b=new Student("Disha",100,10);
			Student c=new Student("Harsh",100,10);
			System.out.print("First: "+b.isEqual(b, c));
			System.out.println();
			System.out.print("Second: "+b.isEqual(a, c));
			

		}

}
