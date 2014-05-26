package com.taobiao.back.inter;

import java.util.List;

import com.taobiao.beans.Product;

public interface ManagerProduct {
     public void addProduct(Product product);
     public void delectProduct(Integer id);
     public void updateProduct(Product product);
     //����Ʒ��ID��ѯ
     public Product getProduct(Integer id);
     //��ѯ���еĲ�Ʒ�����з�ҳ
     public List<Product>  getProducts(int firstResult,int maxResults );
     //�����ѯ�У������ؽ��в�ѯ
     public List<Product>  getProductsByBrandLocation(String brand,int firstResult,int maxResults );
    //�����ܽ��в�ѯ����ʱ��û��ʵ��
     public List<Product>  getProductsBySeriesName(String series,int firstResult,int maxResults );
}
