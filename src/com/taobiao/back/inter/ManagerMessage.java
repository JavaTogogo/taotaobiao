package com.taobiao.back.inter;

import java.util.List;
import java.util.Set;

import com.taobiao.beans.Message;

public interface ManagerMessage {
   //��ҳ�鿴����
	public List<Message> getMessage(int firstResult,int maxResults );
	//ɾ������
	public void delectMessage(Integer id);
	//�����û���ID�鿴���ԣ����ǲ鿴�û�����������
	public Set<Message> getUserMessage(Integer userID,int firstResult,int maxResults );
}
