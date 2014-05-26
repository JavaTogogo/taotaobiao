package com.taobiao.back.test;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taobiao.back.inter.ManagerUser;
import com.taobiao.beans.TUser;

public class TestManagerUser {

	private static ManagerUser managerUser;
	
	@BeforeClass

	public static void setUpBeforeClass() throws Exception {
		ApplicationContext acx= new ClassPathXmlApplicationContext("applicationContext.xml");
		managerUser=  (ManagerUser) acx.getBean("managerUser");
	}

	@Test
	public void test() {
		/*
		 * 	public AbstractTUser(String name, String password, String msn, String qq,
			String officePhone, String homePhone, String cellphone,
			String email, String passwordTip, String passwordAnswer,
			Timestamp lastLogintime, Float balance, Integer consume,
			String level, String status, Set messages, Set collects,
			Set userorders, Set consigneeAddresses) 
		 */
		managerUser.addUser
		(new TUser("hh", "123", "123", "123", "123123", "123123", "123123", "123123", "1231231231", "1231231231", new Timestamp(2004,12,02,0,0,0,0), new Float(1), 1, "0", "1", null, null, null, null));
	}
}
