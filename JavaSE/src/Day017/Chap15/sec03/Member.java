package Day017.Chap15.sec03;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {			//name 과 age 값이 같으면 true 를 리턴
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {			//name 과 age 값이 같으면 동일한 hashCode 가 리턴
		return name.hashCode() + age;		//name.hashCode() : String의 hashCode() 이용
	}
}
