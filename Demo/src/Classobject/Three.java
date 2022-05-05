package Classobject;

//here the sum is the method name for different (int, string and double) datatypes. This is know as Methodoverloading

public class Three {
	
	public int sum(int x, int y, int z ) {
		
		return x+y+z;
	}
	
 public String sum(String a, String b, String c)
 {
 return a+b+c;
}
 
 public double sum(double e, double f, double g)
 {
	 return e+f+g;
 }
 
 public static void main(String[] args) {
	 Three t = new Three(); //used for creation of object 
	 System.out.println(t.sum(1, 1, 1));
	 System.out.println(t.sum("Aish", "war", "ya"));
	 System.out.println(t.sum(2.2, 1.2, 3.2));
 }
	
		

	}


