package com.taobiao.back.inter;

import java.util.List;
import java.util.Set;

import com.taobiao.beans.OrderDetail;
import com.taobiao.beans.Userorder;

public interface ManagerUserorder {
    //分页查看订单
	public  List<Userorder>  getUserorders(int firstResult,int maxResults);
	//按订单ID查找订单
	public Userorder getUserorder(String id);
	//确认收货
	public void makeConfirm(String id);
	//查看订单明细
	public Set<OrderDetail> getOrderDetail(String id);
	//关闭订单
	public void closeOrder(String id);
}
