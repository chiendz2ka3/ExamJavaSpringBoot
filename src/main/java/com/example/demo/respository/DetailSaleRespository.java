package com.example.demo.respository;

import com.example.demo.Entities.ProductEntity;
import com.example.demo.Entities.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;
@EnableJpaRepositories
public interface DetailSaleRespository extends JpaRepository<SaleEntity, Long> {
        @Query("select a from SaleEntity a where a.productByProdid.prodid =:product")
        List<SaleEntity> listpr(@Param("product") int product);
}
