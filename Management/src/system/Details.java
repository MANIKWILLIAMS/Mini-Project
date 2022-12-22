package system;
import java.util.Scanner;


public class Details {
	static Student[] array=null;
	static teacher[] array1=null;
	static Student stud= new  Student();
	static teacher th= new  teacher();
	 static Scanner scanner = new Scanner(System.in);
	static int option,option1,roll,num;

	
	
	
	public static void list(){
		

		
		
		System.out.println("1.Student");
		System.out.println("2.Teacher");
		System.out.println("3.Exit");
		
		option=scanner.nextInt();
		if(option==1) {
		

			do {
			System.out.println(" STUDENT DETAILS-");

		 
		System.out.println("1.Insert Student Details");
		System.out.println("2.View Student Details");
		System.out.println("3.search By Student Rollno.");
		System.out.println("4.Search By Student Name");
		System.out.println("5.EXIT");

		option=scanner.nextInt();
		switch (option) {
		
		case 1:
			System.out.println("Enter number of records ");
	  		 num = scanner.nextInt();
	  		array=new Student[num];

	  		for (int i = 0; i < num; i++) {
	  			array[i]=new Student();
	  			array[i].insert();
	  		}

			break;
			
			
		
			case 2:
				for(int i=0;i<num;i++)
				{
					
					array[i].display();
				}
				
				break;
				
			case 3:
				System.out.println("enter rollno.");
				
				int rollno = scanner.nextInt();
				
				
				Student b=stud.searchbyroll(array, rollno) ;
					
				
				
				if(b==null ) 
					{
					System.out.println(" No such record found");
					}
					
				else 
					System.out.println("  record found");
					
			        b.display();
				
				
				break;
				
			
			case 4:
				System.out.println(" enter name ");
				
				String name = scanner.next();
				
				
				
				
				Student [] stds  =  new Student[array.length];

						stds=stud.searchbyname(array , name);
						
						
				for(int i = 0 ; i < stds.length ; i++) {
					
					if(stds[i]!= null) {
						stds[i].display();
					
					}
					else
						System.out.println(" No such record found");
						
						
				}
				
				break;
			
			case 5:
				System.exit(0);
				break;
				
			default :System.out.println("Invalid input");
		}
		
		 
	     
		
		
			
		
		}
			while(option!=0);
		
		}
		
		
		
		
		/* teacher*/
		 if(option==2) {
			
			
		do {
			System.out.println("TEACHER DETAILS-");
		System.out.println("1.Insert Teacher Details");
		System.out.println("2.View Teacher Details");
		System.out.println("3.Search By Teacher Name");
		System.out.println("4.EXIT");

		
		
		option=scanner.nextInt();
		switch (option) {
		
		case 1:
			System.out.println("Enter number of records ");
	  		
			num = scanner.nextInt();
	  		array1=new teacher[num];

	  		for (int i = 0; i < num; i++) {
	  			array1[i]=new teacher();
	  			array1[i].insert();
	  		}
			break;
			
			
		
			case 2:
				for(int i=0;i<num;i++)
				{
					
					array1[i].display();
				}
				
				break;
			
				
			case 3:
				System.out.println(" enter name ");
				
				String name = scanner.next();
				
				
				
				
				teacher [] st  =  new teacher[array1.length];

						st=th.searchstaffname(array1 , name);
						
						
				for(int i = 0 ; i < st.length ; i++) {
					
					if(st[i]!= null) {
						st[i].display();
					
					}
					else
						System.out.println(" No such record found");
						
						
				}
				break;
			
			case 4:
				System.exit(0);
				break;
			default:System.out.println(" Invalid Input");
				
				
		}
			
		}
		while(option!=0);
		}
	}

			public static void main(String[] args)  {
				   String username, password;
			        Scanner scanner = new Scanner(System.in);
			        System.out.print("Enter username:");
			        username = scanner.nextLine();
			        System.out.print("Enter password:");
			        password = scanner.nextLine();
			        if(username.equals("school") && password.equals("123"))
			        {
			            System.out.println("Authentication Successful");
			        }
			        else
			        {
			            System.out.println("Authentication Failed");
			            System.exit(0);
			        }
				
				Details.list();
				
				

			
			}
	
		
		

		
}
	
	



