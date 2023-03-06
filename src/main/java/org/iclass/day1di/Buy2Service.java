package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component

public class Buy2Service {
	
	@Autowired		//이미 만들어진 Buy2Dao 객체(bean)을 자동 주입
	private Buy2Dao dao;
	
//	public Buy2Service(Buy2Dao dao) {
//		System.out.println(":::Buy2Service 커스텀 생성자 :::");
//		this.dao=dao;
//	}

	public Buy2Service() {
		System.out.println(":::Buy2Service 기본 생성자 :::");
	}
	
	private void setDao(Buy2Dao dao) {
		System.out.println("---Buy2Service setter---");
		this.dao=dao;
	}
	
	public void buy() {
		System.out.println("---Buy2Service buy()메소드 ---");
		dao.buy();
	}

}
