package Day003.javaChap03;

public class Example02 {
	public static void main(String[] args) {
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);	//코드 작성
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}
}