package Day011.Chap09.sec05.ex03;

public class Anonymous {
	
	private int field;
	
	public void method (final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
//		arg1 = 20;
//		arg2 = 20;
//		
//		var1 = 30;
//		var2 = 30;
		
		Calculatablable calc = new Calculatablable() {
			@Override
			public int sum(){
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
