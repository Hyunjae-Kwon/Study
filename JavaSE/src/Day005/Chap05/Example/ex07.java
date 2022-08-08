package Day005.Chap05.Example;

public class ex07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		/*
		for (int i = 0; i < array.length; i ++) {
			max = ((max > array[i]) ? max : array[i]);
		}
		*/
		
		for(int i = 0; i < array.length; i ++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
	}
}
