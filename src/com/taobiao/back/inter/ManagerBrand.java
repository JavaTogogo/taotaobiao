package com.taobiao.back.inter;

import com.taobiao.beans.Brand;

public interface ManagerBrand {
    public void addBrand(Brand brand);
    public int deleteBrand(String brandName);
    public void updateBrand(Brand brand);
    public Brand getBrand(String brandName);
    	
    
}
