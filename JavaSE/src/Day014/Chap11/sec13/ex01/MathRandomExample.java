//Math, Random 클래스_Math 클래스_임의의 주사위의 눈 얻기

package Day014.Chap11.sec13.ex01;

public class MathRandomExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) +1;
		System.out.println("주사위 눈 : " + num);
	}
}
