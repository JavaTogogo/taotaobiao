package com.taobiao.back.service;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.back.inter.ManagerBrand;
import com.taobiao.beans.Brand;
import com.taobiao.beans.TUser;

@Transactional
public class ManagerBrandImpl implements ManagerBrand {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	 //增加品牌
	public void addBrand(Brand brand) {
		  sessionFactory.getCurrentSession().persist(brand);
	}
     //删除品牌
	public int deleteBrand(String brandName) {
		System.out.println(brandName);
		String hql="delete from Brand brand where brand.name like:brandname";
		Query queryupdate=sessionFactory.getCurrentSession().createQuery(hql);
		queryupdate.setParameter("brandname", brandName);
		int ret=queryupdate.executeUpdate();
		System.out.println(ret);
	    return ret;
	    
		
	}
     //更新品牌
	public void updateBrand(Brand brand) {
           sessionFactory.getCurrentSession().merge(brand);
		
	}
    //查找品牌
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Brand getBrand(String brandName) {
		 String hql="Select brand from Brand brand where brand.name like:brandname";
	        Query query=sessionFactory.getCurrentSession().createQuery(hql);
	        query.setParameter("brandname", brandName);
	        
	        Brand brand=null;
	         if(query.list().size()==0){
	        	 return brand;
	         }else{
	        	
	        	 brand=(Brand) query.list().get(0);
	         }

			return brand ;
		
	}

}
