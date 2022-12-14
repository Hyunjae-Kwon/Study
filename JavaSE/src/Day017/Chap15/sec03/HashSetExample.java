package Day017.Chap15.sec03;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> setA = new HashSet<String>();
		HashSet setB = new HashSet();					//<String>
		HashSet setHab = new HashSet();					//<String>
		HashSet setKyo = new HashSet();					//<String>
		HashSet setCha = new HashSet();					//<String>
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);
		
		//교집합
		Iterator it = setB.iterator();					//Iterator<String>
		while(it.hasNext()) {
			Object tmp = it.next();						//Object -> String
			if(setA.contains(tmp))
			setKyo.add(tmp);
		}
		
		//차집합
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();						//Object -> String
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		
		//합집합
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("A ∩ B = " + setKyo);		// ㄷ + 한자
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
	}
}
