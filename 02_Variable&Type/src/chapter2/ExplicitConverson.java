package chapter2;

public class ExplicitConverson {

	public static void main(String[] args) {

		double dNum1 = 1.2;
		float fNum2 = 0.9F;

		int inum3 = (int) dNum1 + (int) fNum2;
		System.out.println(inum3);

		int inum4 = (int) (dNum1 + fNum2);
		System.out.println(inum4);
	}

}
