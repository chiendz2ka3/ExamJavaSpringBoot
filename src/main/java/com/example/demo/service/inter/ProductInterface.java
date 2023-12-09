package com.example.demo.service.inter;

import com.example.demo.Entities.ProductEntity;
import com.example.demo.Entities.SaleEntity;

import java.util.List;

public interface ProductInterface {
    public List<ProductEntity> getListProduct();
    public List<SaleEntity> GetListManSellProduct(int manid);
}
