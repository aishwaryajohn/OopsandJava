package Basic;

public class Fourteen {

	public static void main(String[] args) {
		//Sum and average for arrays
		int marks[] = {2,3,4,5,7};
				int sum =0;
		        int average = 0;
		        
		        for(int i=0; i<5; i++)
		        {
		        	sum += marks[i];
		        }
		        System.out.println("Sum of marks" +sum);
		        average = sum/5;
		        System.out.println("Average of marks" +average);
		        
		        

	}

}
