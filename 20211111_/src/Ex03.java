
public class Ex03 {
	static String name; // 정적 변수 : 모든 객체가 값을 공유해서 사용하기 위해
	// 정적 변수 초기화 : static 블럭
	// final 상수
	static final int first;
	static final int second;
	
	// final 변수 : 객체마다 별도 값을 가질 수 있다. 생성자를 이용해 초기화 함.
	final int val1; 
	final int val2;
	static {
		name = "이숭무";
		first = 10;
		second = 5;
	}
	// final 변수는 생성자를 이용해 초기화
	public Ex03(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	public static String getName() {
		return name;
	}
	public static int getFirst() {
		return first;
	}
	public static int getSecond() {
		return second;
	}
	public int getVal1() {
		return val1;
	}
	public int getVal2() {
		return val2;
	}
}
