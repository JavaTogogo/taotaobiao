package com.taobiao.back.inter;

import java.util.List;

import com.taobiao.beans.Product;

public interface ManagerProduct {
     public void addProduct(Product product);
     public void delectProduct(Integer id);
     public void updateProduct(Product product);
     //按产品的ID查询
     public Product getProduct(Integer id);
     //查询所有的产品，进行分页
     public List<Product>  getProducts(int firstResult,int maxResults );
     //分类查询中，按产地进行查询
     public List<Product>  getProductsByBrandLocation(String brand,int firstResult,int maxResults );
    //按功能进行查询，暂时还没有实现
     public List<Product>  getProductsBySeriesName(String series,int firstResult,int maxResults );
}
