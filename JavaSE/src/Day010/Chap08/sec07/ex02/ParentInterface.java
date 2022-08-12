package Day010.Chap08.sec07.ex02;

public interface ParentInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("ParentInterface method2");
	}
}