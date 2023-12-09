package com.example.demo.controller;

import com.example.demo.Entities.ProductEntity;
import com.example.demo.Entities.SaleEntity;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import java.util.List;

@RestController
@RequestMapping("")
public class ProductController {
    @Autowired
    private ProductService _context;

    @GetMapping("/")
    public String GetListProduct(Model model){
        String view = "Product";
        try {
            List<ProductEntity> ListProduct = _context.getListProduct();
            System.out.println("Count:"+ ListProduct.size());
            model.addAttribute("product", ListProduct);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return view;
    }
    @GetMapping("/getproduct/{id}")
    public String GetListProductSale(@PathVariable int id , ModelMap ModelNap){
        String view ="detailSale";
        try {
            List<SaleEntity> listsale = _context.GetListManSellProduct(id);
            ModelNap.addAttribute("sale" , listsale);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return view;
    }
}
