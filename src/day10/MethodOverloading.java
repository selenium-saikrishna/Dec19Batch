package day10;

public class MethodOverloading {

	public static void sumAll(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sumAll(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void sumAll(String a,String b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		sumAll(10,20);
		sumAll(15.55,15.60);
		sumAll("Hello ","Selenium");
		

	}

}



