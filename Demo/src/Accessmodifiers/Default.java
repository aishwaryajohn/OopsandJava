package Accessmodifiers;

public class Default {
	int x,y;
	void sum(int a, int b)
	{
		x=a; y=b;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Default p = new Default();
		p.sum(10, 10);

	}

}
