//제네릭 타입 (class<T>, interface<T>)_Box 클래스

package Day016.Chap13.sec02;

public class Box {
	private Object object;
	public void set(Object object) {this.object = object;}
	public Object get() {return object;}
}
