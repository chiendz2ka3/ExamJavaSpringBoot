package com.example.demo.respository;

import com.example.demo.Entities.ProductEntity;
import com.example.demo.Entities.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SaleRepository extends JpaRepository<ProductEntity , Long> {
//    @Query("select a from ProductEntity a inner join SaleEntity on a.prodid =:product")
//    List<SaleEntity> listpr(@Param("authorId") int product);
}
