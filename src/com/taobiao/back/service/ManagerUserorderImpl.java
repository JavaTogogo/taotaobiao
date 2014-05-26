package com.taobiao.back.service;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.back.inter.ManagerUserorder;
import com.taobiao.beans.OrderDetail;
import com.taobiao.beans.Userorder;

@Transactional
public class ManagerUserorderImpl implements ManagerUserorder {
    
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//得到所有的订单，分页
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Userorder> getUserorders(int firstResult, int maxResults) {
        String hql="Select o from Userorder o";
        Query query=sessionFactory.getCurrentSession().createQuery(hql);
        query.setFirstResult(firstResult);
        query.setMaxResults(maxResults);
        
		return query.list();
	}
    
	//按订单编号进行查询
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Userorder getUserorder(String id) {
	
		return (Userorder) sessionFactory.getCurrentSession().get(Userorder.class, id);
	}
    //确认发货
	public void makeConfirm(String id) {
		Userorder order=(Userorder) sessionFactory.getCurrentSession().load(Userorder.class, id);
		
		order.setIssend("1");
		sessionFactory.getCurrentSession().
		
		merge(order);
		
	}
    //得到相应订单的明细表
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Set <OrderDetail> getOrderDetail(String orderid) {
    
		Userorder userorser=(Userorder) sessionFactory.openSession().
				get(Userorder.class, orderid);
		Set<OrderDetail> orderDetails = userorser.getOrderDetails();
		return orderDetails;
	}
    //关闭订单
	public void closeOrder(String id) {
		Userorder order=(Userorder) sessionFactory.getCurrentSession().get(Userorder.class, id);
		order.setStatus("0");
		sessionFactory.getCurrentSession().merge(order);
	}

}
