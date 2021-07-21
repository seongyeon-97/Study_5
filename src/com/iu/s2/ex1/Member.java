package com.iu.s2.ex1;

public class Member {

	private String id;
	private int age;
	private int muge;
	private int ki;
	
	//외부데이터를 멤버변수에 대입할 때 
	//데이터를 입력하는 메서드는 set멤버변수명으로 시작
	//getter
	public void setId(String id) {
		this.id = id;
	}
	
	
	public void setAge(int age) {		
			this.age = age;		
	}	
	
	public void setMuge(int muge) {
			this.muge = muge;	
	}
	
	public void setKi(int ki) {
			this.ki = ki;
	}
	
	//멤버변수를 외부로 보낼 때
	//데이터를 외부로 내보낼 때는 get멤버변수명으로 시작
	//setter
	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMuge() {
		return muge;
	}
	
	public int getKi() {
		return ki;
	}
	
	public void info() {
		System.out.println("ID : " + id);
		System.out.println("AGE : " + age);
		System.out.println("MUGE : " + muge);
		System.out.println("KI : " + ki);
		test();
	}
	
	private void test() {
		
	}

}


