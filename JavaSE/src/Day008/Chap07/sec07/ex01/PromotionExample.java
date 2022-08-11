package Day008.Chap07.sec07.ex01;

class A{}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b3 = e;   //E가 B의 상속을 받고 있지 않음
//		C c2 = d;   //D가 C의 상속을 받고 있지 않음
	}
}