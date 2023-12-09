package com.example.demo.service;

import com.example.demo.Entities.ProductEntity;
import com.example.demo.Entities.SaleEntity;
import com.example.demo.respository.DetailSaleRespository;
import com.example.demo.respository.SaleRepository;
import com.example.demo.service.inter.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements ProductInterface {

    @Autowired
    private SaleRepository _context;
    @Autowired
    private DetailSaleRespository _cotext2;
    @Override
    public List<ProductEntity> getListProduct() {
        return _context.findAll();
    }

    @Override
    public List<SaleEntity> GetListManSellProduct(int manid) {
        try {
           return _cotext2.listpr(manid);
        }catch (Exception x){
            System.out.println(x.getMessage());
        }
        return null;
    }
}
