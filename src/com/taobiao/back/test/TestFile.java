package com.taobiao.back.test;

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


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestFile extends ActionSupport implements SessionAware{
	private File file;
	private String fileName;
	private String contentType;
	private Map<String, Object>  session;

	public void setMyFile(File file) {
		this.file = file;
	}

	public void setMyFileFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setMyFileContentType(String contentType) {
		this.contentType = contentType;
	}
	public String test(){
		File destFile=new File(ServletActionContext.getServletContext()
				.getRealPath("/uploadfiles")+"/"+fileName);
		copy(file, destFile);
		System.out.println("文件上传成功");
		session.put("filePath", "/uploadfiles"+fileName);
		return SUCCESS;
	}

	public void copy(File srcFile, File destFile) {
		System.out.println("srcFile==>" + srcFile.getAbsolutePath());
		System.out.println("destFile==>" + destFile.getAbsolutePath());
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

	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}



	
}
