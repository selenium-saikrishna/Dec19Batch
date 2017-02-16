
public class Calculator {
	
	public void add()
	{
		int a=20,b=10;
		System.out.println(a+b);
	}
	public void substract()
	{
		int a=20,b=10;
		System.out.println(a-b);
	}
	public void multiply()
	{
		int a=20,b=10;
		System.out.println(a*b);
	}
	public void divide()
	{
		int a=20,b=10;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add();
		c.substract();
		c.multiply();
		c.divide();

	}

}


