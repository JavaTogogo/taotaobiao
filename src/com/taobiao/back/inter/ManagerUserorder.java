package com.taobiao.back.inter;

import java.util.List;
import java.util.Set;

import com.taobiao.beans.OrderDetail;
import com.taobiao.beans.Userorder;

public interface ManagerUserorder {
    //��ҳ�鿴����
	public  List<Userorder>  getUserorders(int firstResult,int maxResults);
	//������ID���Ҷ���
	public Userorder getUserorder(String id);
	//ȷ���ջ�
	public void makeConfirm(String id);
	//�鿴������ϸ
	public Set<OrderDetail> getOrderDetail(String id);
	//�رն���
	public void closeOrder(String id);
}
