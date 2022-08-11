package Day009.Chap07.Example.ex05;

//부모 클래스의 기본 생성자가 없기 때문에 자식 클래스에서
//super(name); 를 작성해 생성자를 호출해줘야 한다.

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);				//부모 클래스의 기본 생성자가 없으므로 생성자 호출 필요
		this.name = name;
		this.studentNo = studentNo;
	}
}