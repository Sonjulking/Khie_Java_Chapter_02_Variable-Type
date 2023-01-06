package khie;

/*
 * 단일문자형 : char형(2바이트 0 ~ 65535 (2^16))
 *  =>자바에서는 유니코드(UTF - 8) 체계로 단일문자가 처리가 된다. //190여개의 언어를 지원함.
 */

public class Variable_06 {

	public static void main(String[] args) {

		char ch = 'A';

		System.out.println("ch >>> " + ch);
		System.out.println("ch >>> " + (int) ch);

		System.out.println(ch + 1); // A를 10진수로 표현하면 65를 뜻함.
		System.out.println((char) (ch + 1));// 66은 B를 뜻함

		char ch1 = 'a';
		System.out.println((int) ch1);

	}

}
