package promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = new Parent();
		parent = child;//부모가 자식을 참조한 경우 자식에만 정의된 것은 사용할 수 없다
		parent.method1();//자식에서 오버라이딩 된 메서드는 사용 가능하다
		parent.method2();
	//	parent.method3(); 자식에만 정의됨

	}

}
