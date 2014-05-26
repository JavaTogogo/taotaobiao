package com.taobiao.back.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.taobiao.back.inter.ManagerAdmin;
import com.taobiao.back.inter.ManagerBrand;
import com.taobiao.back.inter.ManagerMessage;
import com.taobiao.back.inter.ManagerProduct;
import com.taobiao.back.inter.ManagerSeries;
import com.taobiao.back.inter.ManagerUser;
import com.taobiao.back.inter.ManagerUserorder;
import com.taobiao.beans.Admin;
import com.taobiao.beans.Brand;
import com.taobiao.beans.Message;
import com.taobiao.beans.OrderDetail;
import com.taobiao.beans.Product;
import com.taobiao.beans.Series;
import com.taobiao.beans.TUser;
import com.taobiao.beans.Userorder;

public class Test {
	private static ManagerUser managerUser;
	private static ManagerBrand managerBrand;
	private static ManagerSeries managerSeries;
	private static ManagerProduct managerProduct;
	private static ManagerUserorder managerUserorder;
	private static ManagerMessage managerMessage;
	private static ManagerAdmin managerAdmin;
	public static void main(String[] args) {
		ApplicationContext acx= new ClassPathXmlApplicationContext("applicationContext.xml");
		managerSeries=  (ManagerSeries) acx.getBean("managerSeries");
		managerBrand=  (ManagerBrand) acx.getBean("managerBrand");
		managerProduct=(ManagerProduct) acx.getBean("managerProduct");
		managerUserorder=(ManagerUserorder) acx.getBean("managerUserorder");
		managerMessage=(ManagerMessage) acx.getBean("managerMessage");
		managerAdmin=(ManagerAdmin) acx.getBean("managerAdmin");
		managerUser=(ManagerUser) acx.getBean("managerUser");
		//managerUser.addUser(new )
	//	managerUser.addUser
	//	(new TUser("hh", "123", "123", "123", "123123", "123123", "123123", "123123", "1231231231", "1231231231", new Timestamp(2004,12,02,0,0,0,0), new Float(1), 1, "0", "1", null, null, null, null));
	//    managerUser.addUser(new TUser("hh2", "123", "123", "123", "123123", "123123", "123123", "123123", "1231231231", "1231231231", new Timestamp(new Date().getTime()), new Float(1), 1, "0", "1"));
	//     managerUser.deleteUserById(2);
	//      System.out.println( managerUser.getTUser(1).getName() )  ;
	//	managerBrand.addBrand(new Brand("劳力士2", "手表中的亚军，贵族之王", "/images/laolishi.jpg"));
	//	Brand brand=managerBrand.getBrand(1);
	//	Series series=managerSeries.getSeries(1);
	//	brand.setName("劳力士它弟");
	//	managerBrand.updateBrand(brand);
	//	managerSeries.addSeries(new Series(brand,"LX-20","贵族系列"));
	//	Series series=managerSeries.getSeries(1);
	//	series.setDescription("屌丝中的战斗机");
	//	managerSeries.updateSeries(series);
		/*
		Product product =new Product();
			product.setBrand(brand);
			product.setSeries(series);
			product.setLocation("越南");
			product.setProductName("金劳");
			product.setSales(13000);
			product.setTopCarriageTime(new Timestamp(new Date().getTime()));
		managerProduct.addProduct(product);
		*/
		//managerProduct.delectProduct(10);
		//Product product=managerProduct.getProduct(1);
		//product.setProductName("操你妈金劳");
		//managerProduct.updateProduct(product);
		
		//List<Product> products;
		//products=managerProduct.getProducts(0, 5);
		//products=managerProduct.getProductsByBrandLocation("越南", 0, 5);
		//for(Product p:products){
		//	System.out.println(p.getId());
		//}
		//List <Userorder> userorders=managerUserorder.getUserorders(0, 2);
		//for(Userorder u:userorders){
		//	System.out.println(u.getTotalPrice());
		//}
		//System.out.println(managerUserorder.getUserorder("2").getTotalPrice());
		//managerUserorder.makeConfirm("2");
//		Set<OrderDetail> ods=managerUserorder.getOrderDetail("1");
//		for(OrderDetail od:ods){
//			System.out.println(od.getProductName());
//		}
	//	managerUserorder.closeOrder("3");
//	Set<Message> messages=	managerMessage.getUserMessage(1,0, 2);
//	for(Message m:messages){
//		System.out.println(m.getTitle());
//	}
	//	managerMessage.delectMessage(3);
//	//	managerAdmin.addAdmin(new Admin("小敏", "123", "13800138000", "13800138000", "994760844@qq.com", "1", "0"));
//		System.out.println(managerAdmin.getAdmin(5).getName());
//		Admin admin =managerAdmin.getAdmin(5);
//		admin.setName("老婆");
//		managerAdmin.alterAdmin(admin);
//		
//		managerAdmin.deleteAdmin(5);
//		System.out.println(managerUser.getTUserByName("hh").getName());
//	System.out.println(managerUser.getTUser("hh"));	
//		managerUser.deleteUserByName("ww");
//		managerBrand.deleteBrand("hwl");
//		Brand brand=managerBrand.getBrand("劳力士");
//		System.out.println(brand.getStory());
	}

}
