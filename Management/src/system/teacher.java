package system;

import java.util.*;




public class teacher  {

	String name,sub,dept;
	 int age,salary,num;
	 teacher [] array1=null;
	
	
	
	  teacher[] array = new teacher[num];
 
	

	  	
	public void insert() {

	  		Scanner scanner=new Scanner(System.in);  
			
	  		System.out.println("Enter name");
	  		name =scanner.next();
	  		System.out.println("Age");
	  		age= scanner.nextInt();;
	  		System.out.println("Subject");
	  		sub= scanner.next();
	  		System.out.println("Department");
	  		dept = scanner.next();
	  		System.out.println("Salary");
	  		salary= scanner.nextInt();


		
	}

	
	public void display() {
		

System.out.println("Name       : "+name+"\n"+
		           "Age        : " +age+"\n"+
				   "Subject    : " +sub+"\n"+
				   "Department : " +dept+"\n"+
				   "Salary     : " +salary+"\n");
		
		
		
	}
public teacher[] searchstaffname(teacher[] array, String name) {
	teacher[] arr = new teacher[array.length];
	
	 for(int i = 0 ; i< array.length ; i++) {
		   
			
			
			
			if(array[i].name.equals(name)) { 
			   
			  arr[i] = array[i];
			  System.out.println(arr[i]);
			 
		   }
		   
	   }
	
	
	
	return arr;
}



	
}





