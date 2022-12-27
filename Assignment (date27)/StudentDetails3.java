package Assignment;

public class StudentDetails extends college{
	public void StudentName() {
System.out.println("srikanth");
}
	public void StudentID() {
		System.out.println("318UME084");
	}
	public void StudentMail() {
		System.out.println("srikanth77@gmail.com");
	}
	public static void main(String[] args) {
		StudentDetails Det=new StudentDetails();
		Det.collegeCode();
		Det.CollegeName();
		Det.collegeRank();
		Det.Department();
		Det.CollegeName();
		Det.StudentID();
		Det.StudentMail();
	}
}
