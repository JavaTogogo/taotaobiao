package com.taobiao.back.inter;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.beans.TUser;

public interface ManagerUser {

	//�����û�
	public void addUser(TUser user);

	//ɾ���û�
	public int deleteUserByName(String name);

	//�鿴�û�

	public TUser getTUser(Integer id);
	//ͨ�����ֲ��û�
	public TUser getTUserByName(String name);
	
	//�鿴�û���ҳ
	public List<TUser> getTUsers(int firstResult,int maxResults);

	public void setSessionFactory(SessionFactory sessionFactory);

}