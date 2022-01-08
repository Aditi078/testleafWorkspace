package week3.day1assignment;

public class Students {

	public void getStudentInfo(int id) {
		
		System.out.println("ID:: " + id);
	}

	public void getStudentInfo(int id, String name) {

		System.out.println("ID:: " + id + ", Name:: " + name);
	}

	public void getStudentInfo(String email, long phnNo) {

		System.out.println("Email:: " + email + ", phnNo:: " + phnNo);
	}

	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo(07);
		stu.getStudentInfo(07, "Aditi Ghosh");
		stu.getStudentInfo("aditighosh078@gmail.com", 9163547539L);
	}

}
