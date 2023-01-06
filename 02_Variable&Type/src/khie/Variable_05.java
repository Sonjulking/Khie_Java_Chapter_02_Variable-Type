package khie;

/*
 * 실수자료형 : 소수점이 존재하는 자료형이다.
 *  -float : 소수점이하 6 ~ 7자리까지 표현이 가능하다.
 *  -double( 기본형 ) : 소수점 이하 15 ~ 16자리까지 표현이 가능함.
 */
public class Variable_05 {

	public static void main(String[] args) {

		double dNum = 123.45666;

		System.out.println("dNum >>> " + dNum);

		// float fNum = dNum; 묵시적으로 하면 오류 나니까 명시적으로 해줘야된다.
		// float fNum = (float) dNum;
		// float fNum = 1234.56; 기본이 더블형이라서 오류가 난다.
		// float fNum = (float) 12345.67; 해주거나 12345.67f 이런식으로 표현해주어야 한다.

		/*
		 * float 자료형의 변수에 실수 값을 저장시 오류가 발생한다. 이유 : 실수 자료형의 기본형은 double형이기 때문이다. -따라서
		 * float 자료형의 변수에 실수 데이터를 저장시 반드시 실수 값 뒤에 f를 붙여 주어야 한다.(생략시 error가 발생한다.) -실수
		 * 자료형에서 명시적 형변환 작업을 진행하더라도 자료의 손실은 거의 발생하지 않는다.
		 */

	}

}
