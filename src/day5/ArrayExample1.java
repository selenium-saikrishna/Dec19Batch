package day5;

public class ArrayExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a={20,10,30,90,70};
		
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
