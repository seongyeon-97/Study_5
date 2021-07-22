package com.iu.s3.ex1;

public class StaticTest {
	
	//접근지정자 [그 외 지정자] 데이터타입 변수명;
	public static int num = 10;
	public int num2 = 20;
	
	//접근지정자 [그 외 지정자] 리턴타입 메서드명(매개변수) {  }
	public static void staticMethod() {
		System.out.println("static method");
		System.out.println(StaticTest.num);
		//System.out.println(this.num2);
		//this.instanceMethod();
		//클래스메서드 내에서는 멤버변수,멤버메서드 호출x
	}
	
	public void instanceMethod() {
		System.out.println("instance method");
		System.out.println(StaticTest.num);
		System.out.println(this.num2);
		//this() -> 생성자 호출할 때
		//참조변수명.메서드명();
		//멤버메서드 내에서 클래스변수, 클래스메서드 호출O
		StaticTest.staticMethod();
		
	}
}
