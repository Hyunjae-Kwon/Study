//제네릭 타입_제네릭 타입

package Day016.Chap13.sec02_Generic;

public class Box<T> {
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
}
