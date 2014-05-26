package com.taobiao.back.formbean;

import java.io.File;

public class FormBrand {
     private String name;
     private String story;
     private File myFile;
 	 private String fileName;
 	 private String contentType;
	public File getMyFile() {
		return myFile;
	}
	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}

     
}
