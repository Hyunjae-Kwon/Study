package Day018.Chap15.Example.ex10;

public class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {
		//코드 작성
		if(score < o.score) return -1;
		else if( score == o.score) return 0;
		else return 1;
	}
}
