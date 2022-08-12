package Day010.Chap08.sec07.ex01;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface2 - method2() 실행");
	}
}