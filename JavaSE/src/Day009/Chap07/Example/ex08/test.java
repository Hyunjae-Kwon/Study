package Day009.Chap07.Example.ex08;

class A{};

class B extends A {}
class C extends A {}

class D extends B {}
class E extends B {}

class F extends C {}

public class test {
	B b = new B();
	B b1 = (B) new A();
	B b3 = new D();
	B b4 = new E();
	
	public void method(B b) {
		
	}
}
