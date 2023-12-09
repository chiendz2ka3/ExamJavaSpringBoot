package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Sale", schema = "dbo", catalog = "thuchanh")
public class SaleEntity {
    @Basic
    @Column(name = "Sino")
    private Integer sino;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "salemanid")
    private int salemanid;
//    @Basic
//    @Column(name = "prodid")
//    private Integer prodid;
    @Basic
    @Column(name = "SalesmanName")
    private String salesmanName;
    @Basic
    @Column(name = "DOS")
    private String dos;
    @ManyToOne
    @JoinColumn(name = "prodid", referencedColumnName = "prodid")
    private ProductEntity productByProdid;

    public Integer getSino() {
        return sino;
    }

    public void setSino(Integer sino) {
        this.sino = sino;
    }

    public int getSalemanid() {
        return salemanid;
    }

    public void setSalemanid(int salemanid) {
        this.salemanid = salemanid;
    }

//    public Integer getProdid() {
//        return prodid;
//    }

//    public void setProdid(Integer prodid) {
//        this.prodid = prodid;
//    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SaleEntity that = (SaleEntity) o;

        if (salemanid != that.salemanid) return false;
        if (sino != null ? !sino.equals(that.sino) : that.sino != null) return false;
        //if (prodid != null ? !prodid.equals(that.prodid) : that.prodid != null) return false;
        if (salesmanName != null ? !salesmanName.equals(that.salesmanName) : that.salesmanName != null) return false;
        if (dos != null ? !dos.equals(that.dos) : that.dos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sino != null ? sino.hashCode() : 0;
        result = 31 * result + salemanid;
        //result = 31 * result + (prodid != null ? prodid.hashCode() : 0);
        result = 31 * result + (salesmanName != null ? salesmanName.hashCode() : 0);
        result = 31 * result + (dos != null ? dos.hashCode() : 0);
        return result;
    }

    public ProductEntity getProductByProdid() {
        return productByProdid;
    }

    public void setProductByProdid(ProductEntity productByProdid) {
        this.productByProdid = productByProdid;
    }
}
