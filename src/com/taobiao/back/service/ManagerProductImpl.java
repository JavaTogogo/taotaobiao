package com.taobiao.back.service;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.back.inter.ManagerProduct;
import com.taobiao.beans.Product;

@Transactional
public class ManagerProductImpl implements ManagerProduct {
    private SessionFactory sessionFactory; 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addProduct(Product product) {
	   sessionFactory.getCurrentSession().persist(product);
		 
	}

	public void delectProduct(Integer id) {
		sessionFactory.getCurrentSession().
		delete(sessionFactory.getCurrentSession().load(Product.class, id));
		
	}

	public void updateProduct(Product product) {
		sessionFactory.getCurrentSession().merge(product);
		
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> getProducts(int firstResult, int maxResults) {
		String hql="select p from Product p";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResults);
		List<Product> products=query.list();
		return products;
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> getProductsByBrandLocation(String location, int firstResult,
			int maxResults) {
		String hql="select p from Product p where p.location like:brandId";

		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("brandId", location);
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResults);
		
		List<Product> products=query.list();
		return products;
	
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public List<Product> getProductsBySeriesName(String seriesName,
			int firstResult, int maxResults) {
		String hql="select p from Product p where p.series=?";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		//query.setFirstResult(firstResult);
		//query.setMaxResults(maxResults);
		query.setParameter(1, seriesName);
		List<Product> products=query.list();
		return products;
	}

	public Product getProduct(Integer id) {
	
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

}
