package com.taobiao.back.inter;

import java.util.List;
import java.util.Set;

import com.taobiao.beans.Message;

public interface ManagerMessage {
   //分页查看留言
	public List<Message> getMessage(int firstResult,int maxResults );
	//删除留言
	public void delectMessage(Integer id);
	//根据用户的ID查看留言，就是查看用户的所有留言
	public Set<Message> getUserMessage(Integer userID,int firstResult,int maxResults );
}
