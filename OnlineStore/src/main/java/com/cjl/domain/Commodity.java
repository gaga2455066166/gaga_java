package com.cjl.domain;

public class Commodity {
    private Integer nid;
    private String sname;
    private String sdescription;
    private Double nprice;
    private String simg;
    private String smctag = "Y";//是否缺货
    private String dcdate;
    private String smaxid;
    private String sminid;
    private String sindex;

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

    public String getSmaxid() {
        return smaxid;
    }

    public void setSmaxid(String smaxid) {
        this.smaxid = smaxid;
    }

    public String getSminid() {
        return sminid;
    }

    public void setSminid(String sminid) {
        this.sminid = sminid;
    }

    public String getSindex() {
        return sindex;
    }

    public void setSindex(String sindex) {
        this.sindex = sindex;
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
                ", smaxid='" + smaxid + '\'' +
                ", sminid='" + sminid + '\'' +
                ", nindex=" + sindex +
                '}';
    }
}
