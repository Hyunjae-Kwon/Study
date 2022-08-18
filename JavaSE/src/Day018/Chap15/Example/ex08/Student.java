package Day018.Chap15.Example.ex08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		//코드 작성
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		//코드 작성
		if(!(obj instanceof Student)) return false;
		Student student = (Student) obj;
		if((studentNum != student.studentNum)) return false;
		return true;
	}
}
