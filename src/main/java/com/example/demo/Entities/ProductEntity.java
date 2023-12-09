package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Product", schema = "dbo", catalog = "thuchanh")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "prodid")
    private int prodid;
    @Basic
    @Column(name = "prodname")
    private String prodname;
    @Basic
    @Column(name = "descriptions")
    private String descriptions;
    @Basic
    @Column(name = "dateofmanf")
    private String dateofmanf;
    @Basic
    @Column(name = "price")
    private Double price;

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getDateofmanf() {
        return dateofmanf;
    }

    public void setDateofmanf(String dateofmanf) {
        this.dateofmanf = dateofmanf;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (prodid != that.prodid) return false;
        if (prodname != null ? !prodname.equals(that.prodname) : that.prodname != null) return false;
        if (descriptions != null ? !descriptions.equals(that.descriptions) : that.descriptions != null) return false;
        if (dateofmanf != null ? !dateofmanf.equals(that.dateofmanf) : that.dateofmanf != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prodid;
        result = 31 * result + (prodname != null ? prodname.hashCode() : 0);
        result = 31 * result + (descriptions != null ? descriptions.hashCode() : 0);
        result = 31 * result + (dateofmanf != null ? dateofmanf.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
