package com.cjl.domain;

public class Commodity {
    private Integer nid;
    private String sname;
    private String sdescription;
    private Double nprice;
    private String simg;
    private String smctag;//是否缺货
    private String dcdate;
    private Integer nmaxid;
    private Integer nminid;

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

    public String getSmctag() {
        return smctag;
    }

    public void setSmctag(String smctag) {
        this.smctag = smctag;
    }

    public String getDcdate() {
        return dcdate;
    }

    public void setDcdate(String dcdate) {
        this.dcdate = dcdate;
    }

    public Integer getNmaxid() {
        return nmaxid;
    }

    public void setNmaxid(Integer nmaxid) {
        this.nmaxid = nmaxid;
    }

    public Integer getNminid() {
        return nminid;
    }

    public void setNminid(Integer nminid) {
        this.nminid = nminid;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "nid=" + nid +
                ", sname='" + sname + '\'' +
                ", sdescription='" + sdescription + '\'' +
                ", nprice=" + nprice +
                ", simg='" + simg + '\'' +
                ", smctag='" + smctag + '\'' +
                ", dcdate='" + dcdate + '\'' +
                ", nmaxid=" + nmaxid +
                ", nminid=" + nminid +
                '}';
    }
}
