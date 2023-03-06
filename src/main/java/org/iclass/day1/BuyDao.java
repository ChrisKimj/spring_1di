package org.iclass.day1;

public class BuyDao {	//11111111111111
	
	private String dbFactory;	//String타입의 프로퍼티
	
	public BuyDao() {
		System.out.println("::::: BuyDao 기본 생성자 :::::");
	}
	
	//생성자 주입
	public BuyDao(String dbFactory) {
		System.out.println("::::: BuyDao 커스텀 생성자 - String dbFactory 주입 :::::");
		this.dbFactory=dbFactory;
	}
	
	//setter 주입
	public void setDbFactory(String dbFactory) {
		this.dbFactory = dbFactory;
	}
	
	public void buy() {
		System.out.print("~~~~~ dao buy()~~~~~~");
		System.out.println(dbFactory + "를 이용하여 db에 연결합니다.");
		//**** 다오는 db를 부름
	}


}
