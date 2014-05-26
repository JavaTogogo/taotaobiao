package com.taobiao.back.service;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taobiao.back.inter.ManagerSeries;
import com.taobiao.beans.Brand;
import com.taobiao.beans.Series;

@Transactional
public class ManagerSeriesImpl implements ManagerSeries {
   
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//增加品牌系列
	public void addSeries(Series series) {
            sessionFactory.getCurrentSession().persist(series);
		 
	}
    //删除品牌系列
	public int deleteSeries(String seriesName) {
	//      sessionFactory.getCurrentSession().
	//      delete(sessionFactory.getCurrentSession().load(Series.class, id));
		System.out.println(seriesName);
		String hql="delete from Series series where series.name like:brandname";
		Query queryupdate=sessionFactory.getCurrentSession().createQuery(hql);
		queryupdate.setParameter("brandname", seriesName);
		int ret=queryupdate.executeUpdate();
		System.out.println(ret);
	    return ret;
		
	}
    //更新品牌系列
	public void updateSeries(Series series) {
         sessionFactory.getCurrentSession().merge(series);  
		
	}
    //查找品牌系列
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Series getSeries(String seriesName) {
		 String hql="Select series from Series series where series.name like:brandname";
	        Query query=sessionFactory.openSession().createQuery(hql);
	        query.setParameter("brandname", seriesName);
	        
	        Series series=null;
	         if(query.list().size()==0){
	        	 return series;
	         }else{
	        	
	        	 series=(Series) query.list().get(0);
	         }

			return series ;

		//return (Series) sessionFactory.getCurrentSession().get(Series.class, id);
	}

}
