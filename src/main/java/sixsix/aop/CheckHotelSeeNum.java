package main.java.sixsix.aop;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.java.sixsix.dao.RegistDAO;
import main.java.sixsix.model.Homestay_Type;

@Component
@Aspect
public class CheckHotelSeeNum {

	@Autowired
	HttpSession httpSession;
	
	@Autowired // wen xuan's service
	RegistDAO DAO;
	

	@Pointcut("execution(* main.java.sixsix.controller.ManagementFunction.processMemberHotelOrder(..))")
	public void pointcut() {
		
	}
	
	
	
	@After("pointcut()")
	public void after() {
		String houseid = httpSession.getAttribute("hotelID_AOP").toString();
		System.out.println(houseid);
		String houseType = httpSession.getAttribute("hotelType_AOP").toString();
		System.out.println(houseType);
		List<Homestay_Type> list = DAO.getThisHowmanySee(houseid,houseType);
		
		Integer seeoverhotel = list.get(0).getSeeoverhotel();
		
		
		httpSession.setAttribute("howmanyPeopleSee", list.get(0));
		
		System.out.println(list.get(0).getSeeoverhotel()+"---------------------");
		
		System.out.println("===============AFTER+++++++++");
		
	}
	
//	@Before("pointcut()")
//	public void before() {
//		String houseid = httpSession.getAttribute("hotelID_AOP").toString();
//		String houseType = httpSession.getAttribute("hotelType_AOP").toString();
//		
//		List<Homestay_Type> list = DAO.getThisHowmanySee(houseid,houseType);
//		
//		Integer seeoverhotel = list.get(0).getSeeoverhotel();
//		
//		
//		httpSession.setAttribute("howmanyPeopleSee", seeoverhotel);
//		
//		
//		
//		System.out.println("===============BEFORE+++++++++");
//		
//	}
	
	
}
