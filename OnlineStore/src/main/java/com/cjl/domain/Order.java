package com.cjl.domain;

public class Order {
    private String sorder;
    private String suser;
    private Integer nid;
    private String sname;
    private String sdescription;
    private Double nprice;
    private String simg;
    private Integer nquantity;
    private Double ntotal;
    private String ddate;
    private String saddress;
    private String sdelivery;

    public String getSorder() {
        return sorder;
    }

    public void setSorder(String sorder) {
        this.sorder = sorder;
    }

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

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public String getSdelivery() {
        return sdelivery;
    }

    public void setSdelivery(String sdelivery) {
        this.sdelivery = sdelivery;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sorder='" + sorder + '\'' +
                ", suser='" + suser + '\'' +
                ", nid=" + nid +
                ", sname='" + sname + '\'' +
                ", sdescription='" + sdescription + '\'' +
                ", nprice=" + nprice +
                ", simg='" + simg + '\'' +
                ", nquantity=" + nquantity +
                ", ntotal=" + ntotal +
                ", ddate='" + ddate + '\'' +
                ", saddress='" + saddress + '\'' +
                ", sdelivery='" + sdelivery + '\'' +
                '}';
    }
}
