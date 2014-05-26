package com.taobiao.back.service;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.back.inter.ManagerMessage;
import com.taobiao.beans.Message;
import com.taobiao.beans.TUser;

@Transactional
public class ManagerMessageImpl implements ManagerMessage {
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Message> getMessage(int firstResult, int maxResults) {
         String hql="Select m from Message m";
         Query query=sessionFactory.getCurrentSession().createQuery(hql);
         query.setFirstResult(firstResult);
         query.setMaxResults(maxResults);
         List<Message> messages=query.list();
		return messages;
	}

	public void delectMessage(Integer id) {
	    sessionFactory.getCurrentSession()
	    .delete(sessionFactory.getCurrentSession().get(Message.class, id));
		
	}
    @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Set <Message> getUserMessage(Integer userID, int firstResult, int maxResults) {
		TUser user=(TUser) sessionFactory.openSession().get(TUser.class,userID);
		Set<Message> messages=user.getMessages();
		return messages;
	}

}
