package com.cjl.domain;

public class Cart {
    private String suser;
    private Integer nid;
    private String sname;
    private String sdescription;
    private Double nprice;
    private String simg;
    private Integer nquantity;
    private Double ntotal = 0.00;

    public String getSuser() {
        return suser;
    }

    public void setSuser(String suser) {
        this.suser = suser;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSdescription() {
        return sdescription;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription;
    }

    public Double getNprice() {
        return nprice;
    }

    public void setNprice(Double nprice) {
        this.nprice = nprice;
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg;
    }

    public Integer getNquantity() {
        return nquantity;
    }

    public void setNquantity(Integer nquantity) {
        this.nquantity = nquantity;
    }

    public Double getNtotal() {
        return ntotal;
    }

    public void setNtotal(Double ntotal) {
        this.ntotal = ntotal;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "suser='" + suser + '\'' +
                ", nid=" + nid +
                ", sname='" + sname + '\'' +
                ", sdescription='" + sdescription + '\'' +
                ", nprice=" + nprice +
                ", simg='" + simg + '\'' +
                ", nquantity=" + nquantity +
                ", ntotal=" + ntotal +
                '}';
    }
}
