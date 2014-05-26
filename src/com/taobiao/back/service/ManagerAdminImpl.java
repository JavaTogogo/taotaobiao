package com.taobiao.back.service;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.back.inter.ManagerAdmin;
import com.taobiao.beans.Admin;

@Transactional
public class ManagerAdminImpl implements ManagerAdmin{
    private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addAdmin(Admin admin) {
        sessionFactory.getCurrentSession().persist(admin);
		
	}

	public Admin getAdmin(Integer id) {
	    
		return (Admin) sessionFactory.getCurrentSession().get(Admin.class, id);
	}

	public void alterAdmin(Admin admin) {
		sessionFactory.getCurrentSession().merge(admin);
		
	}

	public void deleteAdmin(Integer id) {
		sessionFactory.getCurrentSession().
		delete(sessionFactory.getCurrentSession().get(Admin.class, id));
		
	}

}
