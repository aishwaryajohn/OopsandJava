package Accessmodifiers;

public class Private {
	int x,y;
	private void sum(int a, int b)
	{
		x=a; y=b;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Private p = new Private();
		p.sum(10, 10);

	}

}
