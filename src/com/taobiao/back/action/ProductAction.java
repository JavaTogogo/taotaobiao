package com.taobiao.back.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.taobiao.back.inter.ManagerBrand;
import com.taobiao.back.inter.ManagerProduct;
import com.taobiao.back.inter.ManagerSeries;
import com.taobiao.beans.Brand;
import com.taobiao.beans.Product;
import com.taobiao.beans.Series;

public class ProductAction extends ActionSupport implements SessionAware,ModelDriven<Product>{
	Map<String, Object> session;
    Product product=new Product();
    ManagerProduct managerProduct;
    ManagerBrand managerBrand;
	ManagerSeries managerSeries;
	Brand brand;
	Series series;
    String brand_name;
    String series_name;
    public void setManagerBrand(ManagerBrand managerBrand) {
		this.managerBrand = managerBrand;
	}

	public void setManagerSeries(ManagerSeries managerSeries) {
		this.managerSeries = managerSeries;
	}

    public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	File myFile;
    String myFileFileName;
    String myFileContentType;
    
    public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	//增加商品
	public String addProduct(){
		
		session.remove("ProductBrandIsNull");
		session.remove("ProductSeriesIsNull");
		session.remove("MyFileIsNull");
		session.remove("ProductOk");
		session.remove("flag");
		
		if(managerBrand.getBrand(brand_name)==null){
			session.put("ProductBrandIsNull", "<font color='red'>品牌不存在</font>");
			return ERROR;
		}
		if(managerSeries.getSeries(series_name)==null){
			session.put("ProductSeriesIsNull", "<font color='red'>系列不存在</font>");
			return ERROR;
		}

		if(!managerSeries.getSeries(series_name).getBrand().getName().equals(brand_name)){
			session.put("ProductBrandIsNull", "<font color='red'>品牌不存在该系列</font>");
			return ERROR;
		}
		if(myFile==null){
			session.put("MyFileIsNull", "<font color='red'>文件不能为空</font>");
			return ERROR;
		}
		brand=managerBrand.getBrand(brand_name);
		series=managerSeries.getSeries(series_name);
		File destFile=new File(ServletActionContext.getServletContext()
				.getRealPath("/uploadfiles")+"/"+myFileFileName);
		copy(myFile, destFile);
		product.setPic("/uploadfiles"+"/"+myFileFileName);
		product.setBrand(brand);
		product.setSeries(series);
		product.setTopCarriageTime(new Timestamp(new Date().getTime()));
		managerProduct.addProduct(product);
		session.put("ProductOk", "<font color='red'>商品添加成功</font>");
    	return SUCCESS;
    }
	//根据产地得到商品
	public String getProductsByBrandLocation(){
	    session.remove("GetProductError");
	    session.remove("product");
	    session.remove("flag");
		List<Product> products=managerProduct.getProductsByBrandLocation(product.getLocation(), 0, 5);
        if(products.size()==0){
        	session.put("GetProductError", "<font color='red'>查询失败</font>");
        }
		session.put("products", products);
		return SUCCESS;
		
	}
	//判断是否更新商品更新的话显示出相应的窗口
	public String isUpDateProduct(){
		session.remove("product");

		session.put("Product_Id", product.getId());
		product=managerProduct.getProduct(product.getId());
		session.put("product", product);
		session.put("flag", "flag");
		return SUCCESS;
	}
	//更新商品
	public String upDateProduct(){
		
		session.remove("ProductBrandIsNull2");
		session.remove("ProductSeriesIsNull2");
		session.remove("MyFileIsNull2");
		session.remove("ProductOk2");
		session.remove("flag");
		session.remove("DelOk");
		
		if(managerBrand.getBrand(brand_name)==null){
			session.put("ProductBrandIsNull2", "<font color='red'>品牌不存在</font>");
			return ERROR;
		}
		if(managerSeries.getSeries(series_name)==null){
			session.put("ProductSeriesIsNull2", "<font color='red'>系列不存在</font>");
			return ERROR;
		}

		if(!managerSeries.getSeries(series_name).getBrand().getName().equals(brand_name)){
			session.put("ProductBrandIsNull2", "<font color='red'>品牌不存在该系列</font>");
			return ERROR;
		}
		if(myFile==null){
			session.put("MyFileIsNull2", "<font color='red'>文件不能为空</font>");
			return ERROR;
		}
		brand=managerBrand.getBrand(brand_name);
		series=managerSeries.getSeries(series_name);
		File destFile=new File(ServletActionContext.getServletContext()
				.getRealPath("/uploadfiles")+"/"+myFileFileName);
		copy(myFile, destFile);
		System.out.println("==");
		System.out.println(session.get("Product_Id"));
		Product get_product=managerProduct.getProduct((Integer)session.get("Product_Id"));
		get_product.setPic("/uploadfiles"+"/"+myFileFileName);
		get_product.setBrand(brand);
		get_product.setSeries(series);
		get_product.setTopCarriageTime(new Timestamp(new Date().getTime()));
		get_product.setProductName(product.getProductName());
	    get_product.setFace(product.getFace());
	    get_product.setDial(product.getDial());
	    get_product.setFunction(product.getFunction());
	    get_product.setLocation(product.getLocation());
	    get_product.setMechanism(product.getMechanism());
	    get_product.setMechanismType(product.getMechanismType());
	    get_product.setModel(product.getModel());
	    get_product.setPrice(product.getPrice());
	    get_product.setSpecialPrice(product.getSpecialPrice());
	    get_product.setRemark(product.getRemark());
		managerProduct.updateProduct(get_product);
		session.put("ProductOk2", "<font color='red'>商品更新成功</font>");
    	return SUCCESS;
	}
	//根据品牌得到商品
	public String getProductsByBrand(){
		
		return null;
	}
	
	
	//删除商品
	public String delProduct(){
	//	System.out.println(product.getId());
		session.put("DelOk", "<font color='red'>删除成功</font>");
		managerProduct.delectProduct(product.getId());
		return SUCCESS;
	}

	public void setManagerProduct(ManagerProduct managerProduct) {
		this.managerProduct = managerProduct;
	}


	public void setSession(Map<String, Object> session) {
	
		this.session=session;
	}


	public Product getModel() {
		
		return product;
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
