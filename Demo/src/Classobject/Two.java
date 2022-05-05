package Classobject;
//creating objects and assigning values within the same class

public class Two {

	
		int empid;
		String name;
		
		void assign(int x , String y) 
		{
			empid = x;
			name = y;
		
		}
		
		void display()
		{
			System.out.println("The Employee id is"+empid);
			System.out.println("The Employee name is" +name);
		}
		
		public static void main(String[] args) {
			
		Two e = new Two();
		e.assign(100, "Aishwarya");
		e.display();
		}
			
		}
		

	


