package com.taobiao.back.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.taobiao.beans.Series;

public class SeriesAction extends ActionSupport implements ModelDriven<Series>{
     Series series=new Series();
     
     
	public Series getModel() {
		
		
		return null;
	}

}
