package com.taobiao.back.inter;

import com.taobiao.beans.Admin;

public interface ManagerAdmin {
    //���ӿͷ�
	public void addAdmin(Admin admin);
	//�鿴�ͷ���Ϣ
	public Admin getAdmin(Integer id);
	//���¿ͷ�
	public void  alterAdmin(Admin admin);
	//ɾ���ͷ�
	public void deleteAdmin(Integer id);
	
}
