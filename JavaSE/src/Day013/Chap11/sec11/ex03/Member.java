//Arrays 클래스_배열 항목 정렬_Comparable 구현 클래스

package Day013.Chap11.sec11.ex03;

public class Member implements Comparable<Member> {
	String name;
	public Member(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
