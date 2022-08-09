//Objects 클래스_객체 비교 (compare(T a, T b, Comparator<T>c))_학생 번호 비교자

package Day013.Chap11.sec04.ex01;

import java.util.Comparator;

import Day013.Chap11.sec04.ex01.ComparatorExample.Student;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
	}
}
