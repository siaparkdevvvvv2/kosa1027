package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1; i<=5; i++) {
			int problemLocation = car.run(); //1,2,3,4
			switch(problemLocation) {
			//다형성 / 아래처럼 한 타이어(객체)가 여러 타이어(타입)를 가질 수 있다
			//조건 : 상속이 되어야 함
			//    : 부모가 자식을 참조해야 함
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽 ", 6);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontLeftTire = new KumhoTire("앞오른쪽 ", 4);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);	
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
		}
	}

}
