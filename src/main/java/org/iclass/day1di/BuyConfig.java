package org.iclass.day1di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.iclass.day1di","",""})
//@ComponentScan(basePackages = "org.iclass.day1di") 같음

public class BuyConfig {

}
//@Configuration 어노테이션: 설정정보를 갖는 클래스
//@ComponentScan(basePackages = "org.iclass.day1di") : 
								// basePackages로 지정된 패키지의 모든 클래스를 스캔하겟다.
//				@Component를 찾아서 bean(객체)을 만들기 위한 스캔이다. 배열형식으로 여러 패키지를 설정할 수 잇다.

//주의 : @ComponentScans 는  @ComponenetScan의 배열
	//@Configuration
	//@ComponentScans({ 
		//  @ComponentScan(1.basePackages = "com.baeldung.annotations"), 
		//  @ComponentScan(2.basePackageClasses = VehicleFactoryConfig.class)
		//})
	//class VehicleFactoryConfig {}