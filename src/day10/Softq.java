package day10;

public class Softq {

	int fee;
	String course;
	public void courseDetails(int fee,String course)
	{
		this.fee=fee;
		this.course=course;
	}
	public static void main(String[] args) {
		Softq s=new Softq();
		s.courseDetails(5000,"selnium");
		System.out.println(s.fee+"-----"+s.course);

	}

}









