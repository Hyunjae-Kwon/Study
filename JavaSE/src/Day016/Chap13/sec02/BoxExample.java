//제네릭 타입 (class<T>, interface<T>)_제네릭 타입

package Day016.Chap13.sec02;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}
}
