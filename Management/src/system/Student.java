package system;

import java.util.*;





public class Student {

	String name;
	 int roll;
	int java;
	int python;
	int php;
	int num;
	 Student [] array=null;

	public void insert() {
	  		int n;  
	  		Scanner scanner=new Scanner(System.in);  
	  		
		System.out.println("Enter name");
		 name = scanner.next();
		System.out.println("Roll no.");
		 roll= scanner.nextInt();
		System.out.println("Mark of Java");
		 java= scanner.nextInt();
		System.out.println("Mark of Python");
		 python = scanner.nextInt();
		System.out.println("Mark of php");
		 php= scanner.nextInt();


		
	}

	
	public void display() {
		
		int tol=java+python+php;
		System.out.println("Name           : " +name+"\n"+
				           "Roll No        : " +roll+"\n"+
		 				   "Mark of Java   : " +java+"\n"+
		 				   "Mark of Python : " +python+"\n"+
		 				   "Mark of php    : " +php+"\n"+
		 				   "Total Marks    : " +tol+"\n");
		
		
		
	}

	

public Student searchbyroll(Student[] array, int rollno) {

for(int i = 0 ; i < array.length ; i++)
{
		if(array[i].roll==rollno ) 
			
			return array[i];
		}
		
			
			return null;
		
}


public Student[] searchbyname(Student[] array, String name) {
	Student[] arr = new Student[array.length];
	
	   for(int i = 0 ; i< array.length ; i++) {
		   
			
		
			
			if(array[i].name.equals(name)) { 
			   
			  arr[i] = array[i];
			  System.out.println(arr[i]);
			 
		   }
		   
	   }
	
	
	
	return arr;
}
}





