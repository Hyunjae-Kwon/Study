package Day007.Chap06.sec11.ex01;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456 - 1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "789456 - 7894561";
		p1.name = "을지문덕";
		System.out.println(p1.name);
	}
}