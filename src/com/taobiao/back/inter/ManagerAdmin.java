package com.taobiao.back.inter;

import com.taobiao.beans.Admin;

public interface ManagerAdmin {
    //增加客服
	public void addAdmin(Admin admin);
	//查看客服信息
	public Admin getAdmin(Integer id);
	//更新客服
	public void  alterAdmin(Admin admin);
	//删除客服
	public void deleteAdmin(Integer id);
	
}
