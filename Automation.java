package week3.day2assignment;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public void Selenium() {
		System.out.println("Selenium is a method of TestTool interface and it has implemented inside Automation class");

	}

	public void Java() {
		System.out.println("Java is a method of Language interface and it has implemented inside Automation class");

	}

	@Override
	public void ruby() {
		System.out.println(
				"Ruby is an un implemented method of MultipleLangauge and it has implemented inside Automation class");
	}

	public static void main(String[] args) {

		Automation test = new Automation();

		test.Java();
		test.Selenium();
		test.ruby();
		test.python();

	}

}
