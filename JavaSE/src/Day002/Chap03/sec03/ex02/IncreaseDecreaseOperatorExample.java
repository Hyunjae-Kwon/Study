package Day002.Chap03.sec03.ex02;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------");
		x++;	//다음에 +1
		++x;	//바로 +1
		System.out.println("x = " + x);
		
		System.out.println("---------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("---------------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("---------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}