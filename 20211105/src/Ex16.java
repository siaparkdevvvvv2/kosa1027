
public class Ex16 {

	public static void main(String[] args) {
		// 1, 3, 5, 7, 9곱만 출력하시오
		for(int gop = 1; gop <= 9; gop +=2) {
			System.out.println("7 * "+gop+" = "+7*gop);
		}
		
		System.out.println("======");
		for(int gop = 1; gop <= 9; gop ++) {
			if(gop % 2 == 0)continue;
			System.out.println("7 * "+gop+" = "+7*gop);

		System.out.println("===while===");
		gop = 1;
		while (gop <= 9) {
			gop++;
			if(gop % 2 == 0) continue;
			System.out.println("7 * "+gop+" = "+7*gop);
		
		System.out.println("=====");
		gop = 1;
		while (true) {
			gop++;
			if(gop % 2 == 0) continue;
			if(gop > 9) break;
			System.out.println("7 * "+gop+" = "+7*gop);
			//if(gop > 9) break; 위의 똑같은 식이 여기 위치에 있으면 11까지 실행됨
		}
   }
  }
 }
}
