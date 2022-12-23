package Day_02;

public class DataType {

	public static void main(String[] args)
	{
		// 변수 선언
		// 정수형
		int num1 = 10;
		long num2 = 20000000L;
		System.out.println(num1+"\n"+num2);
		int vInt = Integer.parseUnsignedInt("4294967295");
		System.out.println(vInt);
		
		// 실수형타입
		double num3 = 3.141592;
		float num4 = 3.1415f;
		System.out.println("float 실수 표현: " + num3 +" 와 "+ num4);
		
		// 문자열과 문자형 보기
		String Name = "김재형";
		char sex = '남';
		
		System.out.println("당신의 이름은 : "+Name);
		System.out.println("당신의 성별은 : "+sex);
		//System.out.println((int)Name);
		char c = 97;
		float z = 3.13f;
		System.out.println(c);
		System.out.println((int)z);
	}

}
