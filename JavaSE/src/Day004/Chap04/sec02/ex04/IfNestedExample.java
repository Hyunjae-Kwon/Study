package Day004.Chap04.sec02.ex04;

public class IfNestedExample {
	public static void main(String[] args) {

		int score = (int) (Math.random() * 20) + 81;
		// random : 0~1 사이의 실수 // Math.random()*20 -> 0~19
		System.out.println("점수 : " + score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점 : " + grade);
	}
}

//학점 계산기, 95이상 A+ 90이상 A, 85이상 B+, 나머지 B 작성해보기