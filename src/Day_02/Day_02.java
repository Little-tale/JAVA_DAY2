package Day_02;

// import java.util.Scanner;

public class Day_02 
{
	public static void main(String[] args) 
	{
	int age; // 초기값을 지정하지 않아
	age = 0; // 출력이 되지않아 초기화를 함
	
	//이걸 한번에도 가능하다
	int lengh = 30;
	
	System.out.println("age   : " +age);
	System.out.println("lengh : " +lengh);
	
	char a ='a';
	System.out.println(a);
	//각 문자를 숫자로 지정해놓아 컴퓨터가 인식 할 수 있음
	System.out.println((int)a);
	
	char b ='가';
	System.out.println((int)b);
	//출력 메소드() 소괄호 안에 있는 값이 출력된다.
	// 이때 같은 변수명이 될 수도 있다.
	System.out.println("안녕하세요");
	
	
	}

}
