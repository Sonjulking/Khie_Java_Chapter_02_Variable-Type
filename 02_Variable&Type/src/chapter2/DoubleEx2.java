package chapter2;

public class DoubleEx2 {

	public static void main(String[] args) {
		double dnum = 1;

		for (int i = 0; i < 10000; i++) {
			dnum += 0.1;
		}
		System.out.println(dnum); // 1001이 나와야 되지만 약간의 오차가 생김.
		// 지수로 표현되는 값이 0을 나타낼수 없기때문에.
	}

}
