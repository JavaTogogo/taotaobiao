package com.taobiao.back.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.taobiao.back.formbean.FormBrand;
import com.taobiao.back.inter.ManagerBrand;
import com.taobiao.beans.Brand;

public class BrandAction extends ActionSupport implements SessionAware {
    //���������ϴ���Logo�Ĳ���
	private File file;
	private String fileName;
	private String contentType;
	private String name;
	private String story;
	private String myFile;
	private Brand brand;




	private Map<String, Object> session;
	private ManagerBrand managerBrand;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setStory(String story) {
		this.story = story;
	}


	
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public void setManagerBrand(ManagerBrand managerBrand) {
		this.managerBrand = managerBrand;
	}

	public void setMyFile(File myFile) {
		this.file = myFile;
	}

	public void setMyFileFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setMyFileContentType(String contentType) {
		this.contentType = contentType;
	}
	
	public void setSession(Map<String, Object> session) {
	  
		this.session=session;
	}
	//����Ʒ�Ƶ�Action
	public String addBrand(){
	    
		session.remove("BrandIsNotNull");
		session.remove("FileIsNull");
		session.remove("AddBrandSuccess");
		session.remove("flag");
		if(managerBrand.getBrand(name)!=null){
		   session.put("BrandIsNotNull", "<font color='red'>Ʒ���Ѵ���</font>");
		   return "FileIsNull";
		}
		if(file==null){
			session.put("FileIsNull", "<font color='red'>�ļ�����Ϊ��</font>");
			return "FileIsNull";
		}
		File destFile=new File(ServletActionContext.getServletContext()
				.getRealPath("/uploadfiles")+"/"+fileName);
		copy(file, destFile);
        brand.setName(name);
        brand.setStory(story);
		brand.setLogo("/uploadfiles"+"/"+fileName);
		managerBrand.addBrand(brand);
		session.put("AddBrandSuccess", "<font color='red'>���Ʒ�Ƴɹ�</font>");

		return SUCCESS;
		
	}
	//�鿴Ʒ��
	public String getBrandByName(){
		session.remove("Del");
		session.remove("brand");
		session.remove("BrandIsNull");
		session.remove("flag");
		session.remove("UpDateBrandSuccess");
		brand=managerBrand.getBrand(name);
		if(brand==null){
			session.put("BrandIsNull", "<font color='red'>Ʒ��Ϊ��</font>");
		}
		session.put("brand", brand);
		
		return SUCCESS;
		
	}
	//ɾ��Ʒ��
	public String delBrand(){
		session.remove("Del");
		session.remove("flag");
		int ret= managerBrand.deleteBrand(name);
		if(ret==1){
			session.put("Del", "<font color='red'>ɾ���ɹ�</font>");
			session.remove("brand");
		}else{
			session.put("Del", "<font color='red'>ɾ��ʧ��</font>");
		}
		return "Del";
	
	}
	//�ж��Ƿ����Ʒ��
	public String isUpDateBrand(){
	//	System.out.println("asdf");
			session.put("flag", "flag");
			session.put("updatename", name);
			return SUCCESS;
	}
	//����Ʒ��
	public String upDateBrand(){
		session.remove("BrandIsNotNull");
		session.remove("FileIsNull");
		session.remove("AddBrandSuccess");
		session.remove("flag");
		session.remove("UpDateFileIsNull");
		if(file==null){
			session.put("UpDateFileIsNull", "<font color='red'>�ļ�����Ϊ��</font>");
			return "FileIsNull";
		}

		
		
	
			File destFile=new File(ServletActionContext.getServletContext()
					.getRealPath("/uploadfiles")+"/"+fileName);
			copy(file, destFile);
			brand=managerBrand.getBrand((String)session.get("updatename") );
			brand.setName(name);
	        brand.setStory(story);
			brand.setLogo("/uploadfiles"+"/"+fileName);
			managerBrand.updateBrand(brand);
			session.put("UpDateBrandSuccess", "<font color='red'>����Ʒ�Ƴɹ�</font>");
			session.remove("flag");
			session.put("brand", brand);
		
		return SUCCESS;
	}
	
	public void copy(File srcFile, File destFile) {
		//System.out.println("srcFile==>" + srcFile.getAbsolutePath());
		//System.out.println("destFile==>" + destFile.getAbsolutePath());
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			FileInputStream fis = new FileInputStream(srcFile);
			FileOutputStream fos = new FileOutputStream(destFile);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			byte[] buf = new byte[1012];
			int length = 0;
			while ((length = bis.read(buf)) != -1) {
				bos.write(buf, 0, length);
			}
			bos.flush();
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException ex) {

			ex.printStackTrace();
		} finally {

			if (bis != null) {
				try {
					bis.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

	}


}
