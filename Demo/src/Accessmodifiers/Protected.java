package Accessmodifiers;

public class Protected {
	int x,y;
	protected void sum(int a, int b)
	{
		x=a; y=b;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Protected p = new Protected();
		p.sum(10, 10);

	}

}