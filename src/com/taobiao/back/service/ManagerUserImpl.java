package com.taobiao.back.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.back.inter.ManagerUser;
import com.taobiao.beans.TUser;

@Transactional
public class ManagerUserImpl implements ManagerUser  {
	private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	//增加用户
	public void addUser(TUser user){
    	 sessionFactory.getCurrentSession().save(user);
     }
	//删除用户
	public int deleteUserByName(String name){
		String hql="delete from TUser user where user.name like:username";
		Query queryupdate=sessionFactory.getCurrentSession().createQuery(hql);
		queryupdate.setParameter("username", name);
		int ret=queryupdate.executeUpdate();
	    return ret;
	}
	//查看用户
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public TUser getTUser(Integer id){
		
		return (TUser) sessionFactory.getCurrentSession().get(TUser.class, id);
		
	}
	
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<TUser> getTUsers(int firstResult, int maxResults) {
		String hql="Select u from TUser u";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResults);
		List<TUser> tusers=query.list();
		return tusers;
	}
	public TUser getTUserByName(String name) {
        String hql="Select u from TUser u where u.name like:username";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("username", name);
        TUser tuser=null;
         if(query.list().size()==0){
        	 return tuser;
         }else{
        	 tuser=(TUser) query.list().get(0);
         }

		return tuser ;
	}
}
