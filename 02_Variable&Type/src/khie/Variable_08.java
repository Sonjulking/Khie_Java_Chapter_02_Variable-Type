package khie;

public class Variable_08 {

	public static void main(String[] args) {

		// 변수 선언 및 변수 초기화
		/*
		 * int su1 = 47; int su2 = 88; 이렇게 자료형이 같으면
		 */

		int su1 = 47, su2 = 88; // 이렇게 한줄로 작성이 가능하다.

		System.out.println("변경 하기 전....");
		System.out.println("su1 >>> " + su1);
		System.out.println("su2 >>> " + su2);

		// 빈줄 추가
		System.out.println();

		// 방법 1
		// int temp = su1;
		// su1 = su2;
		// su2 = temp;

		// 방법2
		int temp = su2;
		su2 = su1;
		su1 = temp;

		System.out.println("변경 한 후 ....");
		System.out.println("su1 >>> " + su1);
		System.out.println("su2 >>> " + su2);

	}

}
