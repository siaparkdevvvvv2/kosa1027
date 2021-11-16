package collectionFramework;

import java.util.ArrayList; //ctrl+shift+o로 import
import java.util.List;

public class ArrayListExample {
	public static void main(String [] args) {
	
	//자바 리스트 배열 단점
	String str [] = {"나는","자바","너무","좋아요"};
	System.out.println(str.length); //배열의 크기는 고정이다.
	str[3] = "참좋아요";
	//str[4] = "."; //3까지만 가능하기 때문에 4 하면 ArrayIndexOutOfBoundsException 오류남
	//리스트는 크기가 유동적이다. 배열과 똑같이 같은 타입만 저장함.
	
	List list = new ArrayList(); //파이썬 리스트와 비슷하다.
	list.add("이숭무");//python은 append
	list.add("이상범");
	list.add("이장범");	
	list.add("이장범"); //리스트에서는 같은 값이 저장된다
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println();
	System.out.println(list.get(2));
	System.out.println();
	
	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i)); }

	for(Object obj : list) {
		System.out.println(obj);
	}
	List<String> list1 = new ArrayList<String>();
	list1.add("이숭무");//python은 append
	list1.add("이상범");
	list1.add("이장범");
	for(String s : list1) {
		System.out.println((s));}
	
	int i = 10;
	Object obj1 = 10;
	System.out.println(obj1);
	String st = "이숭무";
	obj1 = "이숭무";
	double f = 10.5;
	obj1 = 10.5; 
	}
}