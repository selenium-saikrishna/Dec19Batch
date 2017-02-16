package day4;

public class StringComparisons {

	public static void main(String[] args) {
		String a="Selenium";
		String b="Selenium";
		if(a.equals(b))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are different");
		}
		System.out.println("##############################");
		String c="SELENIUM";
		String d="selenium";
		if(c.equalsIgnoreCase(d))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are different");
		}
		System.out.println("##############################");
		String e="Selenium Automation";
		String f="Selenium";
		if(e.contains(f))
		{
			System.out.println("String is present");
		}
		else
		{
			System.out.println("String is not present");
		}
		
		
	}

}
