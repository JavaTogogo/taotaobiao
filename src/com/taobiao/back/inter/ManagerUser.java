package com.taobiao.back.inter;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.beans.TUser;

public interface ManagerUser {

	//增加用户
	public void addUser(TUser user);

	//删除用户
	public int deleteUserByName(String name);

	//查看用户

	public TUser getTUser(Integer id);
	//通过名字查用户
	public TUser getTUserByName(String name);
	
	//查看用户分页
	public List<TUser> getTUsers(int firstResult,int maxResults);

	public void setSessionFactory(SessionFactory sessionFactory);

}