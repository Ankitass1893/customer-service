package com.secor.customer;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Custid")
    private Long Custid;
    @Column(name = "Custname")
    private String Custname;
    @Column(name = "Custdescription")
    private String Custdescription;
    @Column(name = "Custprice")
    private BigDecimal Custprice;
    @Column(name = "CuststockQuantity")
    private int CuststockQuantity;

    public int getCuststockQuantity() {
        return CuststockQuantity;
    }

    public void setCuststockQuantity(int CuststockQuantity) {
        this.CuststockQuantity = CuststockQuantity;
    }

    public BigDecimal getCustprice() {
        return Custprice;
    }

    public void setCustprice(BigDecimal Custprice) {
        this.Custprice = Custprice;
    }

    public String getCustdescription() {
        return Custdescription;
    }

    public void setCustdescription(String Custdescription) {
        this.Custdescription = Custdescription;
    }

    public String getCustname() {
        return Custname;
    }

    public void setCustname(String Custname) {
        this.Custname = Custname;
    }

    public Long getCustid() {
        return Custid;
    }

    public void setCustid(Long Custid) {
        this.Custid = Custid;
    }


}
