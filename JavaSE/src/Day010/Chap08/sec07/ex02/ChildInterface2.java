package Day010.Chap08.sec07.ex02;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {
		System.out.println("ChildInterface2 - method2()");
	}
	
	public void method3();
}