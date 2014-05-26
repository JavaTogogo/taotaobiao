package com.taobiao.back.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.taobiao.back.formbean.RegisterForm;
import com.taobiao.back.inter.ManagerUser;
import com.taobiao.beans.TUser;



public class RegisterAction extends ActionSupport implements ModelDriven<RegisterForm>
            ,RequestAware,SessionAware{
    private RegisterForm formBean =new RegisterForm();
    private ManagerUser managerUser;
    private Map<String, Object> request;
    private Map<String, Object> session;
    private TUser tUser;
    
  
	public void settUser(TUser tUser) {
		this.tUser = tUser;
	}

	//ע�����û�
	public String doRegister(){
		session.remove("UserIsNotNull");
		session.remove("passwordError");
		session.remove("RegisterOk");
		session.remove("UserIsNull");
    	if(managerUser.getTUserByName(formBean.getId())!=null){

    		session.put("UserIsNotNull", "�û��Ѵ���");
    		return "isNotNull";
    	}else if(formBean.getPassword()!=formBean.getConfirmPassword()){
            session.put("passwordError", "���벻һ��");
        	return "isNotNull";
    	}else {
	
    		tUser.setName(formBean.getId());
    		tUser.setPassword(formBean.getPassword());
    		tUser.setCellphone(formBean.getPhone());
    		tUser.setLastLogintime(new Timestamp(new Date().getTime()));
    		managerUser.addUser(tUser);
    		session.put("RegisterOk", "ע��ɹ�");
		}
    	return "yes";
    }
	//�鿴�û�
	public String getTuser(){
		session.remove("UserIsNull");
		if(managerUser.getTUserByName(formBean.getId())!=null){
			tUser=managerUser.getTUserByName(formBean.getId());
			session.put("tUser", tUser);
			return "getOk";
		}else{
			session.put("UserIsNull", "�û�������");
		}
		
		return "getError";
		
	}
	//ɾ���û�
	public String delTuser(){
	  int state= managerUser.deleteUserByName(formBean.getId());
	   session.remove("tUser");
		return "delOk";
		
	}
    
    public void setManagerUser(ManagerUser managerUser) {
			this.managerUser = managerUser;
		}

	public RegisterForm getModel() {
		return formBean;
	}

	public void setRequest(Map<String, Object> request) {
		this.request=request;
		
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
		
		
	}



}
